import java.util.Scanner;
public class Questao1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor do seu empréstimo: R$");
        double totalSaldoDevedor = input.nextDouble();

        System.out.print("Digite a taxa de juros mensal do empréstimo: ");
        double jurosAoMes = input.nextDouble();

        System.out.print("Digite o tempo para pagamento, em meses: ");
        int totalMeses = input.nextInt();

        double saldoDevedorAtual = totalSaldoDevedor;   //saldo devedor inicial
        double amortizacao = totalSaldoDevedor / totalMeses;

        double[] jurosMensal = new double[totalMeses];
        double[] parcelaMensal = new double[totalMeses];

        double totalParcelas = 0;
        double totalJuros = 0;

        String tabela = "";

        for (int i = 0; i < totalMeses; i++) {

            jurosMensal[i] = saldoDevedorAtual * (jurosAoMes/100);
            parcelaMensal[i] = jurosMensal[i] + amortizacao;

            saldoDevedorAtual -= amortizacao;

            tabela += String.format("Parcela %d | Juros: R$%.2f | Prestação: R$%.2f | Saldo devedor: R$%.2f\n", i+1, jurosMensal[i], parcelaMensal[i], saldoDevedorAtual);

            totalParcelas += parcelaMensal[i];
            totalJuros += jurosMensal[i];

        }

        System.out.printf("Valor fixo da amortização R$%.2f, Saldo devedor total R$%.2f com um juros de %.2f%% ao mês\n", amortizacao, totalSaldoDevedor, jurosAoMes);
        System.out.print(tabela);
        System.out.printf("Total: Prestação R$%.2f, Juros R$%.2f, Amortização R$%.2f", totalParcelas, totalJuros, (amortizacao * totalMeses));

    }
}
