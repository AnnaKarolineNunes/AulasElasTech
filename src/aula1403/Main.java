package aula1403;

public class Main {
    public static void main(String[] args) {
        int[] vetor = {5, 2, 9, 1, 7};


        int n = vetor.length;

        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < i; j++) {
                if (vetor[i] < vetor[j]){
                    int vetortemporario = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[i] = vetortemporario;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(vetor[i] + " ");
        }
    }
}
