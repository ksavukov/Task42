package candy;

public class Nougat extends Candy {
    private double sugar;

    public Nougat(String name, double price, double weight, double sugar) {
        super(name, price, weight);
        this.sugar = sugar;
    }

    public double getSugar() {
        return sugar;
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
    }

    @Override
    public String toString() {
        return "Nougat =  [" + super.toString() + ", Сахар: " + sugar + "]";
    }
}
