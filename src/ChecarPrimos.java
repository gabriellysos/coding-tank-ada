import java.util.Scanner;
public class ChecarPrimos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Escolha um número inteiro: ");
        int numero = input.nextInt();

        input.close();

        checarPrimo(numero);
    }

    static void checarPrimo(int num) {
        int qntDivisores = divisores(num);

        if (qntDivisores == 2){
            System.out.println(num + " é um número primo.");
        } else {
            System.out.println(num + " não é um número primo.");
        }
    }

    static int divisores(int num){
        int totalDivisores = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0){
                totalDivisores += 1;
            }
        }
        return totalDivisores;
    }
}
