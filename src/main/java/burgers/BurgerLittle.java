package burgers;

import org.springframework.stereotype.Component;
import supplements.Meat;
import supplements.Supplements;
import supplements.Tomato;

import java.util.ArrayList;
import java.util.List;

@Component("burgerLittle")
public class BurgerLittle implements Burger {

   private List<Supplements> supplements;

    public BurgerLittle(Meat meat, Tomato tomato) {
        this.supplements = new ArrayList<Supplements>();
        supplements.add(meat);
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
