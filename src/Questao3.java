import java.util.Scanner;
public class Questao3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número ímpar para a base do triângulo: ");
        int baseTriangulo = input.nextInt();

        if (baseTriangulo % 2 == 0){
            System.out.println("Número inválido.");
        } else {
            input.close();

            desenharTriangulo(baseTriangulo);
        }
    }

    static void desenharTriangulo(int base){
        int espacos = base/2;

        for (int i = 1; i <= base ; i += 2) {
            for (int j = 0; j < espacos; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            System.out.println();
            espacos--;
        }

        desenharTrianguloInverso(base);
    }

    static void desenharTrianguloInverso(int base){
        int espacos = 0;

        for (int i = base; i >= 1 ; i -= 2) {
            for (int j = 0; j < espacos; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            System.out.println();
            espacos++;
        }
    }
}
