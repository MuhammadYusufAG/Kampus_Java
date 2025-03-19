import java.io.Console;

public class InputConsole {
    public static void main(String[] args) {
        String nama;
        int usia;

        Console con = System.console();

        System.out.print("inputkan nama: ");
        nama = con.readLine();

        System.out.print("Inputkan Usia: ");
        usia = Integer.parseInt(con.readLine());

        System.out.println("Nama kamu adalah " + nama);
        System.out.println("Saat ini berusia " + usia + "Tahun");

    }

}


