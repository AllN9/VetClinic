import java.time.LocalDate;
import java.util.Random;

public class Nurse extends Staff{
    private String whoDoctor;

    public Nurse(String name, LocalDate bithDate, String profession, String whoDoctor){
        super(name, bithDate, profession);

        this.whoDoctor = whoDoctor;
    }

    public void getTemperature(Animal animal) {
        Random random = new Random();
        int temp = random.nextInt(4) + 34;
        animal.takeTemperature(temp);
        System.out.println("у " + animal.getname() + " температура " + temp + " градусов");
    }
}
