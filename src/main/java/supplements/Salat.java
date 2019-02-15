package supplements;

import org.springframework.stereotype.Component;

@Component
public class Salat implements Supplements {
    private double price;

    public Salat() {
        this.price = 1.3;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Salat{" +
                "price=" + price +
                '}';
    }
}
