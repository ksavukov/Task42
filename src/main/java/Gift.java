import candy.Candy;
import candy.Lollipop;
import candy.Marshmallow;
import candy.Nougat;

public class Gift {
    public static void main(String[] args)
    {
        Nougat nougat1 = new Nougat("Mars", 45.2, 30.3, 13.1);
        Marshmallow marshmallow1 = new Marshmallow("Guandy", 200.4, 80.3, 5.6);
        Lollipop lollipop1 = new Lollipop("Chupa-chups", 10.2, 32,12.2);
    Candy [] box = {nougat1, marshmallow1, lollipop1};
        for (Candy someCandy : box) {
          System.out.println(someCandy.toString());
        }
        System.out.println("Цена подарка: " + (nougat1.getPrice()+marshmallow1.getPrice()+lollipop1.getPrice()));
        System.out.println("Вес подарка: " + (nougat1.getWeight()+marshmallow1.getWeight()+lollipop1.getWeight()));
    }

}
