

public class Cercle extends Figura {
    public double r;

    public Cercle(double r) {
        this.r = r;
    }

    public double area() {
        return Math.PI * Math.pow(this.r, 2);
    }

    public String toString() {
        return "El cercle de radi " + this.r + " te area: " + this.area();
    }


    public int compareTo(Figura o) {
        return 0;
    }
}