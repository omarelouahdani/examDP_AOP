package ma.sid.eval;


import ma.sid.eval.Aspect.AppContext;
import ma.sid.eval.Structer.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class DpexamApplication {

    public static void main(String[] args) {
        AppContext.authenticateUser("admin","admin",new String[]{"ADMIN"});
        SpringApplication.run(DpexamApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(Circle t, Rectangle r, Parametrage p){
        System.out.println(" Evaluation ");
        Dessin dessin = new Dessin();
        ArrayList<Figure> figure = new ArrayList<Figure>();
        Parametrage parametrage = new Parametrage();
        Observer o1 = new Circle();
        Observer o2 = new Rectangle();
        parametrage.add((Figure) o1);
        parametrage.add((Figure) o2);
         parametrage.setColorC(12);
         parametrage.setColorS(15);
         parametrage.setEpaisseurC(12);







        return args -> {
            t.surface();
            r.piremiter();
            p.add(t);
            p.add(r);

        };
    }
}
