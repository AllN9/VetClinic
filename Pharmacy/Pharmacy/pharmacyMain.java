package Pharmacy;

import java.util.Iterator;

public class pharmacyMain {
    public static void main(String[] args) {
        Component piniceline = new Component("Piniceline", "10mg", 100);
        Component salt = new Component("Salt", "20gr", 10);
        Component sugar = new Component("Sugar", "87gr", 80);

        Pharmacy pharmacy1 = new Pharmacy();
        pharmacy1.addComponents(salt, piniceline);

        Pharmacy pharmacy2 = new Pharmacy();
        pharmacy2.addComponents(sugar, piniceline);

        Iterator<Component> iterator = pharmacy2;
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
