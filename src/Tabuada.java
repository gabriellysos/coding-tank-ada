import java.util.Scanner;
public class Tabuada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Você quer saber a tabuada de qual número? ");
        int num = input.nextInt();
        input.close();

        int[] listaTabuada= getTable(num);

        tabuadaFormat(num, listaTabuada);
    }

    static int[] getTable(int numero){
        int[] listaTab = new int[10];
        for (int i = 0; i < 10; i++) {
            listaTab[i] = (numero * (i+1)); //??
            }
        return listaTab;
        }

    static void tabuadaFormat(int numero, int[] lista){
        for (int i = 0; i < 10; i++) {
            System.out.println(numero + " x " + (i+1) + " = " + lista[i]); //?
        }
    }

}
