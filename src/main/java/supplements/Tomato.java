package supplements;

import org.springframework.stereotype.Component;

@Component
public class Tomato implements Supplements {

    private double price;

    public Tomato() {
        this.price = 0.5;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Tomato{" +
                "price=" + price +
                '}';
    }
}
