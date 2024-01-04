package Pharmacy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javafx.print.Collation;

public class pharmacyMain {
    public static void main(String[] args) {
        Component piniceline = new Component("Piniceline", "10mg", 100);
        Component salt = new Component("Salt", "20gr", 10);
        Component sugar = new Component("Sugar", "87gr", 80);

        Pharmacy pharmacy1 = new Pharmacy();
        pharmacy1.addComponents(salt, piniceline);
        Pharmacy pharmacy2 = new Pharmacy();
        pharmacy2.addComponents(salt, piniceline);

        //Iterator<Component> iterator = pharmacy1;
        //while (iterator.hasNext()){
        //    System.out.println(iterator.next());
        //} - выводис список компонентов

        IterablePharmacy pharmacy3 = new IterablePharmacy();
        pharmacy3.addComponents(sugar, piniceline);

        for(Component c : pharmacy3) {
            System.out.println(c);
        }// - также выводис список компонентов

        List<Component> list = new ArrayList<>(Arrays.asList(salt, piniceline, sugar));
        Collections.sort(list);
        System.out.println(list);

        System.out.println("================================");

        Set<Pharmacy> result = new HashSet<>();
        result.add(pharmacy1);
        result.add(pharmacy2);
        System.out.println(result.size());
    }
}
