package burgers;

import org.springframework.stereotype.Component;
import supplements.Meat;
import supplements.Peppers;
import supplements.Potatoes;
import supplements.Supplements;

import java.util.ArrayList;
import java.util.List;

@Component("medium")
public class BurgerMedium implements Burger {

   private List<Supplements> supplements;

    public BurgerMedium() {
        this.supplements = new ArrayList<Supplements>();
        supplements.add(new Meat());
        supplements.add(new Peppers());
        supplements.add(new Potatoes());
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
