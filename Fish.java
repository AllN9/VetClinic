import java.time.LocalDate;
import java.util.List;

public class Fish extends Animal implements Swimable {
    public Fish(String name, LocalDate bithDate, List<String> vaccinations, String illness,int temperature, String owner) {
        super(name, bithDate, vaccinations, illness,temperature, owner);
    }

    @Override
    public double swim() {
        System.out.printf("%s swiming", type);

        return 10.0;
    }
}
