


public class Rectangle extends Figura{
    private double l1;
    private double l2;

    public Rectangle(double l1, double l2){
        this.l1 = l1;
        this.l2 = l2;
    }

    public double area(){

        return this.l1 * this.l2;
    }

    public double getL1(){

        return l1;
    }

    public double getL2(){

        return l2;
    }

    public String toString(){
        return "El rectagle d'altura " + this.l1 + " i costat " + this.l2 + " te d'area: " + this.area();
    }


    public int compareTo(Figura o) {
        return 0;
    }
}
