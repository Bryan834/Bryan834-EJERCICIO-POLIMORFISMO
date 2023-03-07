
import java.util.Arrays;


public class GestorClasses {

    public static void sort(Figura[] v){
        Arrays.sort(v);

    }
    /*
    public static void print(Figura[] v) {
        for (Figura figura : v) {
            System.out.println("La figura es:"+figura.toString()+" y te "+ figura.area()+ " m^2");
        }
    }*/

    public static double suma(Figura[] v) {
        double ret = 0;
        for (Figura f : v) {
            System.out.println(f);
            ret += f.area();
        }
        return ret;
    }

    public static void main(String[] args) {
        Figura[] v = new Figura[4];
        v[0] = new Rectangle(5,3);
        v[1] = new Cercle(5);
        v[2] = new Quadrat(5);
        v[3] = new Cercle(120);

        double res = suma(v);

       /* print(v);*/

        System.out.println("L'Area total es: " + res);



    }

}



