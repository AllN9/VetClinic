import java.time.LocalDate;
import java.util.List;

public class Duck extends Animal implements Swimable, Flyable, Goable{
    public Duck(String name, LocalDate bithDate, List<String> vaccinations, String illness, String owner) {
        super(name, bithDate, vaccinations, illness, owner);
    }

    @Override
    public double run() {
        System.out.printf("%s going", type);

        return 5.0;
    }

    @Override
    public double fly() {
        System.out.printf("%s flying", type);

        return 20.0;
    }

    @Override
    public double swim() {
        System.out.printf("%s swiming", type);

        return 10.0;
    }
}
