package burgers;

import org.springframework.stereotype.Component;
import supplements.*;

import java.util.ArrayList;
import java.util.List;

@Component
public class BurgerBig implements Burger {

    private List<Supplements> supplements;

    public BurgerBig() {
        this.supplements = new ArrayList<Supplements>();
        supplements.add(new Meat());
        supplements.add(new Salat());
        supplements.add(new Cheese());
        supplements.add(new Tomato());
    }

    @Override
    public double price() {
        double result = 0;
        for (Supplements s : supplements) {
            result += s.getPrice();
        }
        return result;
    }
}
