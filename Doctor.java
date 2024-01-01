import java.time.LocalDate;

public class Doctor extends Staff{
    public Doctor(String name, LocalDate bithDate, String profession){
        super(name, bithDate, profession);
    }

    public void getIllness(Animal animal) {
        if(animal.getTemp() >= 37){
            animal.takeIllness("Covid19");
            System.out.printf("%s заюолел ковидом", animal.getname());
        }
    }
}
