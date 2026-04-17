public class App {
    public static void main(String[] args) throws Exception {
        int[] vetor = new int[10];

        System.out.println("Vetor não Ordenado:");
        for(int i=0; i < vetor.length; i++){
            vetor[i] = (int) (Math.random() * vetor.length); //preenche o vetor aleatoriamente com números inteiros
            System.out.println(vetor[i]);
        }

        int aux, j;

        for(int i=1; i < vetor.length; i++){ //Algoritimo insertionSort
            aux= vetor[i];
            j = i-1;
            while(j >=0 && vetor[j]> aux){
                vetor[j+1]=vetor[j];
                j--;
            }
            vetor[j+1]=aux;
        }

        System.out.println("Vetor Ordenado:"); //Printa o vetor já ordenado
        for(int i=0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }

    }
}
