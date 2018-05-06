package candy;

public class Marshmallow extends Candy {
    private double cornSyrop;

    public Marshmallow(String name, double price, double weight, double cornSyrop) {
        super(name, price, weight);
        this.cornSyrop=cornSyrop;

    }

    public double getCornSyrop() {
        return cornSyrop;
    }

    public void setCornSyrop(double cornSyrop) {
        this.cornSyrop = cornSyrop;
    }

    @Override
    public String toString() {
        return "Marshmallow =  [" + super.toString() + ", Кукурузный сироп: " + cornSyrop + "]";
    }
}
