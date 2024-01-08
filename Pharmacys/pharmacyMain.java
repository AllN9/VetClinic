package Pharmacys;

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
        pharmacy1.addComponents(salt, sugar);
        Pharmacy pharmacy2 = new Pharmacy();
        pharmacy2.addComponents(salt, piniceline);
        Pharmacy pharmacy3 = new Pharmacy();
        pharmacy3.addComponents(salt, sugar);
        Pharmacy pharmacy4 = new Pharmacy();
        pharmacy4.addComponents(salt, piniceline);

        //Iterator<Component> iterator = pharmacy1;
        //while (iterator.hasNext()){
        //    System.out.println(iterator.next());
        //} - выводис список компонентов

        IterablePharmacy Ipharmacy = new IterablePharmacy();
        Ipharmacy.addComponents(sugar, piniceline);

        for(Component c : Ipharmacy) {
            System.out.println(c);
        }// - также выводис список компонентов

        List<Component> list = new ArrayList<>(Arrays.asList(salt, piniceline, sugar));
        Collections.sort(list);
        System.out.println(list);

        System.out.println("================================");

        List<Pharmacy> list2 = new ArrayList<>(Arrays.asList(pharmacy1, pharmacy2));
        Collections.sort(list2);
        Iterator<Pharmacy> i = list2.iterator();
        while (i.hasNext()) {
            Iterator<Component> iterator = i.next();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
            System.out.println("================================");
        }

        Set<Pharmacy> result = new HashSet<>();
        result.add(pharmacy1);
        result.add(pharmacy2);
        result.add(pharmacy3);
        result.add(pharmacy4);

        System.out.println(result.size());

        System.out.println("================================");
    }
}
