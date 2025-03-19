package Tugas;
import java.util.Scanner;

public class CountCircle {
    public static void main(String[] args) {

        Scanner Jari_Jari = new Scanner(System.in);

        Integer r , diameter;
        double Luas, Keliling, pi = 3.14;

        System.out.println("Program lingkaran java");
        System.out.println("======================");

        //input
        System.out.println("Jari-Jari: ");
        r = Jari_Jari.nextInt();

        //Process or rumus
        diameter = 2 * r;
        Keliling = pi * diameter;
        Luas = pi * r * r;

        //output
        System.out.println("Diameter: " + diameter);
        System.out.println("Luas: " + Luas);
        System.out.println("Keliling: " + Keliling);




    }
}
