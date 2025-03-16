import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Nama: ");
        String nama = in.nextLine();

        System.out.print("Usia: ");
        int usia = in.nextInt();

        System.out.println("Nama saya " + nama+ ", " + usia+ "Tahun");

        int i;
        for ( i = 0; i < usia; i++) {
            System.out.println("i = " + i);
        }
    }
}
