
import burgers.BurgerBig;
import burgers.BurgerLittle;
import burgers.BurgerMedium;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestBurgers {
    public static void main(String[] args) {
        ApplicationContext context =new AnnotationConfigApplicationContext("burgers","supplements");
        BurgerLittle burgerLittle = (BurgerLittle) context.getBean("burgerLittle");
        BurgerBig burgerBig = context.getBean(BurgerBig.class);
        BurgerMedium burgerMedium = (BurgerMedium) context.getBean("medium");
        System.out.println(burgerBig.price());
        System.out.println(burgerMedium.price());
        System.out.println(burgerLittle.price());

    }
}
