package Matrix;

class Matriks {
    //atribute
    int[][] Mat = new int[10][10];

    //method
    Matriks(){
        int i, j;
        for (i = 1; i < 10; i++) {
            for ( j = 1; j < 10; j++) {
                this.Mat[i][j] = 0;
            }
        }
    }

    void isimatriks (int N, int M){
        //mengisi element matriks M[i, j] dengan nilai i+j
        int i,j;

        for (i = 0; i < N; i++) {
            for (j = 0; j < M; j++) {
                this.Mat[i][j] = i + j;
            }
        }
    }

    void tulismatiks (int N, int M){
        //mencetak element matriks
        int i,j;

        for (i = 0; i < N; i++) {
            for (j = 0; j < M; j++) {
                System.out.print(this.Mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    void transpose (int N, int M, int Matt[][]){
        //create transpose matriks
        int i,j;

        for (i = 0; i < N; i++) {
            for (j = 0; j < M; j++) {
                Matt[j][i] = this.Mat[i][j];
            }
        }
    }
}
