import java.util.Scanner;
public class Questao2 {
    public static void main(String[] args) {

        pedirTemperatura();

    }

    static void pedirTemperatura(){
        Scanner input = new Scanner(System.in);

        System.out.print("Informe a temperatura: ");
        double tempOriginal = input.nextDouble();

        input.nextLine();

        pedirUnidadeOriginal(tempOriginal);
    }

    static void pedirUnidadeOriginal(double tempOriginal){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a unidade de temperatura original [C, F, K]: ");
        String unidadeOriginal = input.nextLine();

        if (unidadeOriginal.equals("C") || unidadeOriginal.equals("F") || unidadeOriginal.equals("K")){
            pedirUnidadeFinal(tempOriginal, unidadeOriginal);
        } else {
            System.out.println("Unidade inválida.");
            pedirUnidadeOriginal(tempOriginal);
        }

        input.close();
    }

    static void pedirUnidadeFinal(double tempOriginal, String uniOriginal){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a unidade de temperatura final [C, F, K]: ");
        String unidadeFinal = input.nextLine();

        if (unidadeFinal.equals("C") || unidadeFinal.equals("F") || unidadeFinal.equals("K")){
            calcularTemperatura(tempOriginal, uniOriginal, unidadeFinal);
        } else {
            System.out.println("Unidade inválida.");
            pedirUnidadeFinal(tempOriginal, uniOriginal);
        }

        input.close();
    }

    static void calcularTemperatura(double tempOriginal, String unidadeOriginal, String unidadeFinal) {
        double tempFinal = 0;

        if (unidadeOriginal.equals("C") && unidadeFinal.equals("F")) {
            tempFinal = (tempOriginal * 9 / 5) + 32;
        } else if (unidadeOriginal.equals("F") && unidadeFinal.equals("C")) {
            tempFinal = (tempOriginal - 32) * 5 / 9;
        } else if (unidadeOriginal.equals("C") && unidadeFinal.equals("K")) {
            tempFinal = tempOriginal + 273.15;
        } else if (unidadeOriginal.equals("K") && unidadeFinal.equals("C")) {
            tempFinal = tempOriginal - 273.15;
        } else if (unidadeOriginal.equals("F") && unidadeFinal.equals("K")) {
            tempFinal = (tempOriginal - 32) * 5 / 9 + 273.15;
        } else if (unidadeOriginal.equals("K") && unidadeFinal.equals("F")) {
            tempFinal = (tempOriginal - 273.15) * 9 /5 + 32;
        }

        exibirConversao(tempOriginal, unidadeOriginal, tempFinal, unidadeFinal);
    }

    static void exibirConversao(double tempOriginal, String unidadeOriginal, double tempFinal, String unidadeFinal){

        System.out.printf("%.2f %s = %.2f %s", tempOriginal, unidadeOriginal, tempFinal, unidadeFinal);
    }
}
