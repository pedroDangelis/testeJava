import java.lang.reflect.Array;
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 1 para fibonacci ou 2 para acharLetra: ");
        int resp = scanner.nextInt();

        if (resp == 1) {
            fibonacci();
        }else if (resp == 2){
            acharLetra();
        }else{
            System.out.println("caractere não aceito");
        }
    }

    static void fibonacci(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        int a = 0;
        int b = 1;

        // Se o número é 0 ou 1, ele pertence à sequência de Fibonacci, se for negativo não pertence.
        if (numero == a || numero == b) {
            System.out.println(numero + " pertence a sequencia de Fibonacci");
            return;
        }
        else if(numero < 0){
            System.out.println(numero + " não pertence a sequencia de Fibonacci");
            return;
        }

        // Gera a sequência de Fibonacci até que o valor atinja ou ultrapasse o número
        while (b <= numero) {
            int proximo = a + b;
            a = b;
            b = proximo;

            if (b == numero) {
                System.out.println(numero + " pertence a sequencia de Fibonacci");
                return;
            }
        }

        System.out.println(numero + " não pertence a sequencia de Fibonacci");
        return;
    }

    static void acharLetra(){
        Scanner scanner = new Scanner(System.in);
        int contador = 0;

        System.out.println("Digite uma palavra: ");
        String p = scanner.next();

        String pMinusculo = p.toLowerCase();

        // Array pArray = pMinusculo.toCharArray();

        for(char Letra : pMinusculo.toCharArray()){
            if (Letra == 'a') {
                contador++;
            }
        }

        if (contador > 0) {
            System.out.println("A sua palavra contem " + contador + " letra(s) 'A'");
        }
        else{
            System.out.println("A sua palavra não contem a letra 'A'");
        }
    }
}