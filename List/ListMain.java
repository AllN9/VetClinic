package List;

import java.util.Collection;
import java.util.Collections;

public class ListMain {
    public static void main(String[] args) {
        MyList<String> list = new MyArrayList<>();
        list.add("2");
        list.add("30");
        list.add("20");
        list.add("ggr");
        System.out.println(list.get(0));
        list.delete(1);
        System.out.println(list);


        // HOMEWORK
        MyLinkedList<String> linkedList = new MyLinkedList<>();

        linkedList.addLast("Dostaevskiy");
        linkedList.addLast("Pushkin");
        linkedList.addLast("Dovlatov");
        linkedList.addLast("Aristotel");
        linkedList.addLast("Esenin");
        System.out.println("LinkedList - " + linkedList);

        linkedList.addFirst("Kafka");
        System.out.println("LinkedList - " + linkedList);

        System.out.println("Индекс элемента - " + linkedList.get("Aristotel"));
        System.out.println("Индекс элемента - " + linkedList.get("Tolstoy"));

        linkedList.remove("Kafka");
        System.out.println("LinkedList - " + linkedList);


    }
}
