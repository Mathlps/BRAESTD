public class App {
    public static void main(String[] args) throws Exception {
        int[] vetor = new int[10];

        for(int i = 0; i <  vetor.length; i++){
            vetor[i] = (int) (Math.random() * vetor.length); //preenche o vetor aleatoriamente com núpmeros inteiros
            System.out.println(vetor[i]);
        }

        for(int i = 0; i < vetor.length; i++){
            for(int j = i + 1 ; j < vetor.length; j++){  //BubleSort
                if(vetor[i] > vetor[j]){
                    int aux;
                    aux = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = aux;

                }
            }
        }

        System.out.println("Ordenando vetor");
        for(int i = 0; i < vetor.length; i++){    //Imprimindo o vetor já ordenado 
            System.out.println(vetor[i]);
        }

    }
}
