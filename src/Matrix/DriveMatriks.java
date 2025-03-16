package Matrix;

class DriveMatriks {
    public static void main(String[] args) {

        //membuat objek PI
        Matriks M = new Matriks();

        //mengisi matriks
        M.isimatriks(3,4);

        //menulis matriks
        System.out.println("Isi matriks: ");
        M.tulismatiks(3,4);

        //create transpose
        int[][] M2;
        M2 = new int[4][3];
        M.transpose(3,4,M2);

        //tulis matriks transpose
        System.out.println("Isi transpose: ");
        int i,j;
        for (i = 0; i < 4 ; i++) {
            for ( j = 0; j < 3; j++) {
                System.out.print(M2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
