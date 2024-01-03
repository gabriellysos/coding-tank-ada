import java.util.Scanner;
public class CalculoSalarios {
    public static void main(String[] args) {

        double[] salarios = inputSalarios();

        calcularDescontos(salarios);
    }

    static double[] inputSalarios(){

        Scanner input = new Scanner(System.in);

        System.out.print("Quantos salários você quer informar? ");
        double[] salarios = new double[input.nextInt()];

        for (int i = 0; i <= salarios.length - 1; i++) {
            System.out.printf("Digite o %dº salário: R$", i+1);
            salarios[i] = input.nextDouble();
        }

        System.out.println();

        return salarios;
    }

    static void calcularDescontos(double[] salariosBrutos){

        double[] inss = calcularINSS(salariosBrutos);
        double[] impostoRenda = calcularImpostoRenda(salariosBrutos);

        double[] salariosLiquidos = new double[salariosBrutos.length];

        for (int i = 0; i < salariosBrutos.length; i++) {
            salariosLiquidos[i] = salariosBrutos[i] - (inss[i] + impostoRenda[i]);
        }

        exibirInfos(salariosBrutos, inss, impostoRenda, salariosLiquidos);
    }

    static double[] calcularINSS(double[] salariosBrutos){

        double[] inss = new double[salariosBrutos.length];

        for (int i = 0; i < salariosBrutos.length; i++) {
            if (salariosBrutos[i] <= 1212.00) {
                inss[i] = (salariosBrutos[i] * 7.5 / 100);
            } else if (salariosBrutos[i] > 1212.01 && salariosBrutos[i] <= 2427.35) {
                inss[i] = (salariosBrutos[i] * 9.0 / 100);
            } else if (salariosBrutos[i] > 2427.36 && salariosBrutos[i] <= 3641.03) {
                inss[i] = (salariosBrutos[i] * 12.0 / 100);
            } else if (salariosBrutos[i] > 3641.04 && salariosBrutos[i] <= 7087.22) {
                inss[i] = (salariosBrutos[i] * 14.0 / 100);
            } else {
                inss[i] = (salariosBrutos[i] * 16.5 / 100);
            }
        }

        return inss;
    }

    static double[] calcularImpostoRenda(double[] salariosBrutos){

        double[] impostoRenda = new double[salariosBrutos.length];

        for (int i = 0; i < salariosBrutos.length; i++) {
            if (salariosBrutos[i] <= 1903.98) {
                impostoRenda[i] = 0;
            } else if (salariosBrutos[i] > 1903.99 && salariosBrutos[i] <= 2826.65) {
                impostoRenda[i] = (salariosBrutos[i] * 7.5 / 100);
            } else if (salariosBrutos[i] > 2826.66 && salariosBrutos[i] <= 3751.05) {
                impostoRenda[i] = (salariosBrutos[i] * 15.0 / 100);
            } else if (salariosBrutos[i] > 3751.06 && salariosBrutos[i] <= 4664.68) {
                impostoRenda[i] = (salariosBrutos[i] * 22.5 / 100);
            } else {
                impostoRenda[i] = (salariosBrutos[i] * 27.5 / 100);
            }
        }

        return impostoRenda;
    }

    static void exibirInfos(double[] salariosBrutos, double[] inss, double[] impostoRenda, double[] salariosLiquidos){

        for (int i = 0; i < salariosBrutos.length; i++) {
            System.out.printf("Salário bruto: R$%.2f\n", salariosBrutos[i]);
            System.out.printf("Desconto do INSS: R$%.2f\n", inss[i]);
            System.out.printf("Desconto do imposto de renda: R$%.2f\n", impostoRenda[i]);
            System.out.printf("Salário líquido: R$%.2f\n\n", salariosLiquidos[i]);
        }
    }
}
