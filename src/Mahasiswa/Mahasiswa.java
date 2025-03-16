package Mahasiswa;
import java.util.*;

class Mahasiswa {
    String nama;
    String nim;
    int usia;

    //method
    Mahasiswa(){

    }

    void inputdatamhs(){
        Scanner in = new Scanner(System.in);
        System.out.println("Ketikan Data Mahasiswa: ");
        System.out.print("Nama: "); String nama2 = in.nextLine();
        System.out.print("NIM: "); String nim2 = in.nextLine();
        System.out.print("Usia: "); int usia2 = in.nextInt();

        this.nama = nama2;
        this.nim = nim2;
        this.usia = usia2;

    }

    void tulisdatamhs(){
        System.out.println();
        System.out.println("Data mahasiswa: ");
        System.out.println("Nama: " + this.nama);
        System.out.println("NIM: " + this.nim);
        System.out.println("Usia: " + this.usia);
    }

}

