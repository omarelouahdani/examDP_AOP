package ma.sid.eval.Structer;



import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Dessin {
    ArrayList<Figure> figures;
    ITraiter t;

    public Dessin(){
        figures =new ArrayList<>();
    }
    public void traier(){
        t.traiter();
    }


    public void add(Figure f){
        figures.add(f);
    }

    public void remove(Figure f){
        figures.remove(f);
    }

    public void afficherDessin(){
        for(Figure f: figures){
            f.draw();
        }
    }
    public void serialiser() throws Exception {

        System.out.println("Les donnes  est serialisoble");
        File file=new File("Path");
        FileOutputStream fileOutputStream=new FileOutputStream(file);
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);

        for(Figure f : figures){
            objectOutputStream.writeObject(f);
        }
    }


}
