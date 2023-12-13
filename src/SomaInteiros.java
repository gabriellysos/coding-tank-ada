import java.util.Scanner;

public class SomaInteiros{
    public static void main(String[] args){
         mensagens();
    }

    static void mensagens() {
        int numero = escolherNumero();

        if (numero > 0){
            resultado(numero);
        } else {
            System.out.println("Você digitou um número negativo. Tente novamente: ");
            mensagens();
        }
    }

    static int escolherNumero(){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numeroEscolhido = input.nextInt();

        input.close();
        return numeroEscolhido;
    }

    static void resultado(int numero) {
        int[] valores = soma(numero);
        System.out.println("Foram encontrados " + valores[0] +  " números pares entre 1 e " + numero + ". A soma entre esses números é " + valores[1] + ".");
    }

    static int[] soma(int num) {
        int qntPares = 0;
        int somado = 0;
        int[] valores = {qntPares, somado};

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                valores[0] += 1;  //qntPares
                valores[1] += i;  //somado
            }
        }
        return valores;
    }
}
