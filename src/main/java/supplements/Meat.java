package supplements;

import org.springframework.stereotype.Component;

@Component
public class Meat implements Supplements {
    private double price;

    public Meat() {
        this.price = 4.5;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Supplements.Meat{" +
                "price=" + price +
                '}';
    }
}
