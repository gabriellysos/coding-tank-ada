import java.util.Scanner;
public class TrianguloRetangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a base do triângulo: ");
        int baseTriangulo = input.nextInt();

        input.close();

        getTriangle(baseTriangulo);
    }

    static void getTriangle(int base){
        for (int i = base; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 1; i <= base ; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
