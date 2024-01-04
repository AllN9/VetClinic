import java.time.LocalDate;
import java.util.List;

public abstract class Animal {
    protected String name;
    protected LocalDate bithDate;
    protected List<String> vaccinations;
    protected String illness;
    protected String owner;
    protected int temperature;
    protected String type;

    public Animal(String name, LocalDate bithDate, List<String> vaccinations, String illness,int temperature, String owner){
        this.name = name;
        this.bithDate = bithDate;
        this.vaccinations = vaccinations;
        this.illness = illness;
        this.temperature = temperature;
        this.owner = owner;
        this.type = getClass().getSimpleName();
    }

    public String getname(){
        return name;
    }

    public LocalDate getbithDate(){
        return bithDate;
    }

    public List<String> getvaccinations(){
        return vaccinations;
    }

    public String getillness(){
        return illness;
    }

    public String getowner(){
        return owner;
    }

    private void wakeup() {
        System.out.println("Animal is wakeup!!");
    }

    private void wakeup(int time) {
        System.out.println("Animal is wakeup in " + time + "!!");
    }

    private void eat() {
        System.out.println("Animal ate!!");
    }

    private void play() {
        System.out.println("Animal played!!");
    }

    private void sleep() {
        System.out.println("Animal sleeping!!");
    }

    void takeTemperature(int temp){
        temperature = temp;
    }

    int getTemp(){
        return temperature;
    }

    void takeIllness(String ill){
        illness = ill;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name ='" + name + '\'' + 
                ", bithDate = " + bithDate + 
                ", vaccinations = " + vaccinations + 
                ", temperature ='" + temperature + '\'' +
                ", illness ='" + illness + '\'' + 
                ", owner ='" + owner + '\'' + 
                ", type ='" + type + '\'' +
                '}';
    }
}