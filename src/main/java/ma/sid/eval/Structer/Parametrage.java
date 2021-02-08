package ma.sid.eval.Structer;

import lombok.AllArgsConstructor;
import lombok.Data;
import ma.sid.eval.Aspect.MyLog;
import ma.sid.eval.Aspect.SecuredByAspect;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
@Data @AllArgsConstructor
public class Parametrage implements Observable{
    public  int colorC;
    public int colorS;
    public int epaisseurC;
    public ArrayList<Observer> figures;

    public Parametrage(){
        figures=new ArrayList<>();
    }

    @Override
    public void notif() {
        for(Observer o : figures){
            o.update(this);
        }
    }
    @MyLog
    @SecuredByAspect(roles = {"ADMIN"})
    @Override
    public void remove(Figure f) {
        figures.remove(f);
    }

    @MyLog
    @SecuredByAspect(roles = {"ADMIN"})
    @Override
    public void add(Figure f) {
        figures.add(f);
    }
}
