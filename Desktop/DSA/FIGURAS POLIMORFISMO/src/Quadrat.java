

public class Quadrat extends Rectangle {

    public Quadrat(double l) {
        super(l, l);
    }

    public String toString() {
        return "El quadrat de costat " + this.getL1() + " te d'area: " + super.area();
    }
}