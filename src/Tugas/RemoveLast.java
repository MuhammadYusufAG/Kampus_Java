package Tugas;

import java.util.LinkedList;

public class RemoveLast {
    public static void main(String[] args) {
        LinkedList<String> namaMobil = new LinkedList<>();

        namaMobil.add("BMW");
        namaMobil.add("Toyota");
        namaMobil.add("Volvo");

        System.out.println("Sebelum removeLast : " + namaMobil);

        namaMobil.removeLast();

        System.out.println("Sesudah removeLast : " + namaMobil);
    }
}
