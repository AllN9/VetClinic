package Pharmacy;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Collections;

public class Pharmacy implements Iterator<Component>, Comparable<Pharmacy>{
    private int index;
    private final List<Component> components;
    private int generalPower;

    public Pharmacy(){
        this.index = 0;
        this.components = new ArrayList();
        this.generalPower = 0;
    }

    public void addComponents(Component ... components) {
        if (components.length == 0) System.out.println("Вы ничего не добавили!");
        Collections.addAll(this.components, components);
        for(int i = 0; i < components.length; i++)
        {
            generalPower += components[i].getPower();
        }
    }

    public int ggetPower() {
        return generalPower;
    }

    @Override
    public boolean hasNext() {
        return index < components.size();
    }

    @Override
    public Component next() {
        return components.get(index++);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pharmacy pharmacy = (Pharmacy) o;
        return generalPower == pharmacy.generalPower;
    }

    @Override
    public int hashCode() {
        return generalPower;
    }

    @Override
    public int compareTo(Pharmacy o) {
        return Integer.compare(this.generalPower, o.generalPower);
    }
}
