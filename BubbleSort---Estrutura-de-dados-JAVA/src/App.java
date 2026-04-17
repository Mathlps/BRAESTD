public class App {
    public static void main(String[] args) {

    int[] vetor = new int[10];

    
    for (int i = 0; i < vetor.length; i++) {
        vetor[i] = (int) (Math.random() * vetor.length);
        System.out.println(vetor[i]);
    }

    
    for (int i = 0; i < vetor.length - 1; i++) {
        for (int j = 0; j < vetor.length - 1 - i; j++) {
            if (vetor[j] > vetor[j + 1]) {
                int aux = vetor[j];
                vetor[j] = vetor[j + 1];
                vetor[j + 1] = aux;
            }
        }
    }

    System.out.println("Ordenando vetor");

    
    for (int i = 0; i < vetor.length; i++) {
        System.out.println(vetor[i]);
    }
}

}
