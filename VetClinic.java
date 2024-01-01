import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class VetClinic {
    private List<Animal> patients = new ArrayList<>();

    public void addPatients(Animal animal) {
        patients.add(animal);
    }

    public void addPatients(Animal ... animals) { 
        Collections.addAll(patients, animals);
    }

    public List<Goable> getGoables() {
        List<Goable> result = new ArrayList<>(patients.size());
  
        for (Animal animal : patients) {
            if(animal instanceof Goable){
                result.add((Goable) animal);
            }
        }

        return result;
    }

    public List<Flyable> getFlyables() {
        List<Flyable> result = new ArrayList<>(patients.size());
  
        for (Animal animal : patients) {
            if(animal instanceof Flyable){
                result.add((Flyable) animal);
            }
        }

        return result;
    }

    public List<Swimable> getSwimable() {
        List<Swimable> result = new ArrayList<>(patients.size());
  
        for (Animal animal : patients) {
            if(animal instanceof Swimable){
                result.add((Swimable) animal);
            }
        }

        return result;
    }

    public List<Animal> getPatients() {
        return patients;
    }
}
