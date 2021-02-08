package ma.sid.eval.Structer;

import ma.sid.eval.Aspect.MyLog;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class Rectangle extends Figure implements Serializable {

    public double L;
    public double H;

    public Rectangle(double l,double h,Point p) {
        super(p);
        this.L=l;
        this.H=h;
    }
    public Rectangle() {
        super(new Point(0,0));

    }

    @Override
    @MyLog
    public double surface() {
        return L*H;
    }

    @Override
    @MyLog
    public double piremiter() {
        return 2*(L+H);
    }

    @Override
    @MyLog
    public void draw() {
        System.out.println("L : "+L+"H :"+H+"piremiter :"+piremiter()+"surface :"+surface());
    }

    @Override
    public void afficheEtat() {
            afficheEtat();

            System.out.println("--------------------------");
            System.out.println("         Etat Circle ");
            System.out.println("--------------------------");

    }

    @Override
    public void update(Observable o) {
        int cc=((Parametrage) o).getColorC();
        int cs=((Parametrage) o).getColorS();
        int ec=((Parametrage) o).getEpaisseurC();
        System.out.println("color conteur :"+cc+" colore surface :"+cs+"Epaisseur Color"+ec);
    }
}
