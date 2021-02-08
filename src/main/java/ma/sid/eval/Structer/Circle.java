package ma.sid.eval.Structer;


import ma.sid.eval.Aspect.MyLog;
import ma.sid.eval.Aspect.SecuredByAspect;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class Circle extends Figure implements Serializable {

    public double rayon;

    public Circle(double v, Point point) {
        super(point);
    }
    public Circle() {
        super(new Point(0,0));
    }

    @MyLog
    @Override
    public double surface() {
        return Math.PI * Math.pow(rayon,2);
    }

    @Override
    public double piremiter() {
        return 2 * Math.PI * rayon;
    }

    @Override
    public void draw() {
        System.out.println("rayen :"+rayon + "Surface : "+surface()+"pirimetre :" +piremiter());
    }

    @Override
    public void afficheEtat() {
        System.out.println("--------------------------");
        System.out.println("         Etat Circle ");

    }

    @Override
    @MyLog
    @SecuredByAspect(roles = {"ADMIN"})
    public void update(Observable o) {
        afficheEtat();
        int cc=((Parametrage) o).getColorC();
        int cs=((Parametrage) o).getColorS();
        int ec=((Parametrage) o).getEpaisseurC();
        System.out.println("--------------------------");
        System.out.println("couleur du contour  :"+cc);
        System.out.println("couleur de remplissage :"+cs);
        System.out.println("Epaisseur Color"+ec);
        System.out.println("-----------------------------");



    }
}
