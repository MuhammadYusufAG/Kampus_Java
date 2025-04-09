package Tugas;


import java.util.LinkedList;

public class AddFirst {
    public static void main(String[] args) {
        LinkedList<String> namaMobil = new LinkedList<>();

        namaMobil.add("BMW");
        namaMobil.add("Toyota");
        namaMobil.add("Volvo");

        System.out.println("Sebelum addFirst : " + namaMobil);

        namaMobil.addFirst("Mazda");

        System.out.println("Sesudah addFirst : " + namaMobil);
    }
}
