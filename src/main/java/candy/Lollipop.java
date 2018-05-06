package candy;

public class Lollipop extends Candy {
    private double sugrSyrup;
    public Lollipop(String name, double price, double weight, double sugrSyrup) {
        super(name, price, weight);
        this.sugrSyrup = sugrSyrup;
    }

    public double getSugrSyrup() {
        return sugrSyrup;
    }

    public void setSugrSyrup(double sugrSyrup) {
        this.sugrSyrup = sugrSyrup;
    }

    @Override
    public String toString() {
        return "Lollipop =  [" + super.toString() + ", Сахарный сироп: " + sugrSyrup + "]";
    }
}
