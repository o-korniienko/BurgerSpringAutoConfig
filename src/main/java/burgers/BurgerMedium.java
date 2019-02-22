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

    public BurgerMedium(Meat meat, Potatoes potatoes, Peppers peppers) {
        this.supplements = new ArrayList<Supplements>();
        supplements.add(meat);
        supplements.add(potatoes);
        supplements.add(peppers);
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
