import java.time.LocalDate;
import java.util.List;

public class Fish extends Animal implements Swimable {
    public Fish(String name, LocalDate bithDate, List<String> vaccinations, String illness, String owner) {
        super(name, bithDate, vaccinations, illness, owner);
    }

    @Override
    public double swim() {
        System.out.printf("%s swiming", type);

        return 10.0;
    }
}
