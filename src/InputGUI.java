import  javax.swing.*;

public class InputGUI {
    public static void main(String[] args) {
        String nama = JOptionPane.showInputDialog("nama: ");
        String usia = JOptionPane.showInputDialog("Usia: ");

        int usiaInt = Integer.parseInt(usia);

        System.out.println("Nama saya " + nama + ", Usia"+usia+ " Tahun");
        System.exit(0);
    }
}
