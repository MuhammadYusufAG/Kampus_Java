package Tugas;

import java.util.LinkedList;

public class GetLast {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        
        System.out.println(cars.getLast());
    }
}
