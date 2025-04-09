package Tugas;

import java.util.LinkedList;

public class RemoveFirst {
    public static void main(String[] args) {
        LinkedList<String> namaMobil = new LinkedList<>();

        namaMobil.add("BMW");
        namaMobil.add("Toyota");
        namaMobil.add("Volvo");

        System.out.println("Sebelum removeFirst : " + namaMobil);

        namaMobil.removeFirst();

        System.out.println("Sesudah removeFirst : " + namaMobil);
    }
}
