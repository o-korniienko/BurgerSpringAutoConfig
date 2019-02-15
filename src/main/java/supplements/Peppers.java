package supplements;

import org.springframework.stereotype.Component;

@Component
public class Peppers implements Supplements {
    private double price;

    public Peppers() {
        this.price = 0.9;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Peppers{" +
                "price=" + price +
                '}';
    }
}
