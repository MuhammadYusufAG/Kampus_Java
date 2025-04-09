package Tugas;


import java.util.LinkedList;

public class AddLast {
    public static void main(String[] args) {
        LinkedList<String> namaMobil = new LinkedList<>();

        namaMobil.add("BMW");
        namaMobil.add("Toyota");
        namaMobil.add("Volvo");

        System.out.println("Sebelum addLast : " + namaMobil);

        namaMobil.addLast("Hyundai");

        System.out.println("Sesudah addLast : " + namaMobil);
    }
}
