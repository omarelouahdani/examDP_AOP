package ma.sid.eval.Structer;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.ArrayList;

@Component
public class Group extends Figure implements Serializable {

    private ArrayList<Figure> figures;

    public Group(Point p) {
        super(p);
        figures =new ArrayList<>();
    }
    public Group() {
        super(new Point(0,0));
    }


    @Override
    public double surface() {
        double ans=0;
        for(Figure f: figures){
            ans+=f.surface();
        }
        return ans;
    }

    @Override
    public double piremiter() {
        double ans=0;
        for( Figure f : figures){
            ans=f.piremiter();
        }

        return ans;
    }

    @Override
    public void draw() {
        for (Figure f: figures){
            f.draw();
        }
    }

    @Override
    public void afficheEtat() {

    }

    public void addFigure(Figure f){
        this.figures.add(f);
    }
    public void remove(Figure f){
        figures.remove(f);
    }

    @Override
    public void update(Observable o) {
        for(Figure f : figures){
            f.update(o);
        }
    }
}
