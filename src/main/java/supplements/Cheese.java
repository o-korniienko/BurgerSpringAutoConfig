package supplements;

import org.springframework.stereotype.Component;

@Component
public class Cheese implements Supplements {

    private double price;

    public Cheese() {
        this.price = 2.5;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Cheese{" +
                "price=" + price +
                '}';
    }
}
