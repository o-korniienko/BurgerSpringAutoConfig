package supplements;

import org.springframework.stereotype.Component;

@Component
public class Potatoes implements Supplements {
    private double price;

    public Potatoes() {
        this.price = 0.7;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Potatoes{" +
                "price=" + price +
                '}';
    }
}
