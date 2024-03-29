import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Seminar1 {
    public static void main(String[] args) {
        Cat barsik = new Cat("Barsik", LocalDate.of(2001, 10, 16), new ArrayList<>(), "", 36, "Boss", 4);
        Animal eagle = new Eagle("Kesha", LocalDate.of(2001, 10, 16), new ArrayList<>(), "",36, "Boss");
        Duck kelvin = new Duck("Kelvin", LocalDate.of(2001, 10, 16), new ArrayList<>(), "",36, "Boss");
        Fish nemo = new Fish("Nemo", LocalDate.of(2001, 10, 16), new ArrayList<>(), "",36, "Boss");

        List<Animal> animals = new ArrayList<>();
        animals.add(barsik);
        animals.add(eagle);

        VetClinic clinic = new VetClinic();
        clinic.addPatients(barsik, eagle, kelvin, nemo);
    }
}