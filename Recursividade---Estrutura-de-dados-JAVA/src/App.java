public class App {
    public static void main(String[] args) throws Exception {

        int[] vetor = new int[10];

        System.out.println("Vetor:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);
            System.out.println(vetor[i]);
        }

        System.out.println("Soma:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
       System.out.println(somar(0, 0, vetor));
    }

    private static int somar(int soma, int posicao, int[] vetor) {
        if (posicao < vetor.length) {
            soma = soma + vetor[posicao];
            return somar(soma, posicao + 1, vetor);
        } else {
            return soma;
        }

    }

    

}
