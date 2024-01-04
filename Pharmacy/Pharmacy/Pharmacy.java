package Pharmacy;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Collections;

public class Pharmacy implements Iterator<Component>{
    private int index;
    private final List<Component> components;

    public Pharmacy(){
        this.index = 0;
        this.components = new ArrayList();
    }

    public void addComponents(Component ... components) {
        if (components.length == 0) System.out.println("Вы ничего не добавили!");
        Collections.addAll(this.components, components);
    }

    @Override
    public boolean hasNext() {
        return index < components.size();
    }

    @Override
    public Component next() {
        return components.get(index++);
    }
}
