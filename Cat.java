import java.time.LocalDate;
import java.util.List;

public class Cat extends Animal implements Swimable, Goable{

    private int legsCount;

    public Cat(String name, LocalDate bithDate, List<String> vaccinations, String illness, String owner, int legsCount) {
        super(name, bithDate, vaccinations, illness, owner);
        this.legsCount = legsCount;
    }

    public int getlegsCount(){
        return legsCount;
    }

    @Override
    public double run() {
        System.out.printf("%s going", type);

        return 5.0;
    }

    @Override
    public double swim() {
        System.out.printf("%s swiming", type);

        return 10.0;
    }
}
