package burgers;

import org.springframework.stereotype.Component;
import supplements.*;

import java.util.ArrayList;
import java.util.List;

@Component
public class BurgerBig implements Burger {

    private List<Supplements> supplements;

    public BurgerBig(Meat meat, Salat salat, Cheese cheese, Tomato tomato) {
        this.supplements = new ArrayList<Supplements>();
        supplements.add(meat);
        supplements.add(salat);
        supplements.add(cheese);
        supplements.add(tomato);
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
