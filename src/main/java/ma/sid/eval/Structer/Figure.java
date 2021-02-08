package ma.sid.eval.Structer;


import ma.sid.eval.Aspect.MyLog;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public abstract class Figure implements Observer, Serializable {

    public Point p;

    public Figure(Point p ){

        this.p=p;
    }
    @MyLog
    public abstract double surface();
    @MyLog
    public abstract double piremiter();
    @MyLog
    public abstract void draw();
    @MyLog
    public abstract void afficheEtat();

}
