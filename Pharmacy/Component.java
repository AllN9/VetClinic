package Pharmacy;

public class Component implements Comparable<Component>{
    private String name;
    private String weight;
    private int power;

    public Component(String name, String weight, int power){
        this.name = name;
        this.weight = weight;
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    @Override
    public int compareTo(Component o) {
        //if(this.power > o.power) {return -1;}
        //if(this.power < o.power) {return 1;}
        //else {return 0;}
        return Integer.compare(o.power, this.power);
        //следующий код подходит для сравненияя строк:
        //if(this.name.compareTo(o.name) > 0) {return -1;}
        //if(this.name.compareTo(o.name) < 0) {return 1;}
        //else {return 0;}
        //или
        //return Integer.compare(0, this.name.compareTo(o.name));
    }

    @Override
    public String toString() {
        return "Component{" +
                "name ='" + name + '\'' + 
                ", weight = " + weight + 
                ", power = " + power + '}';
    }
}
