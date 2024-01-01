import java.time.LocalDate;
import java.util.List;

public class Staff {
    protected String name;
    protected LocalDate bithDate;
    protected String profession;
    protected String type;

    public Staff(String name, LocalDate bithDate, String profession){
        this.name = name;
        this.bithDate = bithDate;
        this.profession = profession;
        this.type = getClass().getSimpleName();
    }

    public String getname(){
        return name;
    }

    public LocalDate getbithDate(){
        return bithDate;
    }

    public String getProfession(){
        return profession;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name ='" + name + '\'' + 
                ", bithDate = " + bithDate + 
                ", profession = " + profession + '}';
    }
}
