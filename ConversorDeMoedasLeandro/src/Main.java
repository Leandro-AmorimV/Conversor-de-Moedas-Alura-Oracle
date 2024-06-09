import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String moedaOrigem;
        String moedaAConverter;
        double valor = 0;
        Conversor conversor = new Conversor();

        Scanner digite = new Scanner(System.in);
        String ler = "";
        int sair = 0;


        System.out.println("\n *******************************************");
        System.out.println("\n\t\t\tCONVERSOR DE MOEDAS!");
        System.out.println(" -------------------------------------------");
        System.out.println("\t\tDIGITE QUAL MOEDA DESEJA\n" +
                "\t\tCONVERTER O SEU VALOR E VEJA\n" +
                "\t\tO RESULTADO SAIR COM PRECISÃO!\n");

        System.out.println("*******************************************");
        System.out.println("\t\t\tEXEMPLOS");
        System.out.println("-------------------------------------------");
        System.out.println("ARS = Pesos Argentinos");
        System.out.println("BRL = Real");
        System.out.println("CNY = Yuan");
        System.out.println("EUR = Euro");
        System.out.println("JPY = Yen");
        System.out.println("USD = Dolar");
        System.out.println("*******************************************\n");

        do {

            System.out.println("Digite a moeda de origem(apenas 3 caracteres)");
            moedaOrigem = digite.nextLine();

            System.out.println("Digite para qual moeda você deseja converter(apenas 3 caracteres)");
            moedaAConverter = digite.nextLine();

            System.out.println("Digite o valor que deseja converter");
            valor = digite.nextDouble();

            conversor.convertendoMoeda(moedaOrigem, moedaAConverter, valor);

            System.out.println("se desejar para com o programa digite '1'");
            System.out.println("caso queira continuar aperte digite '2'");
            sair = digite.nextInt();

        } while (sair == 0);

        digite.close();
        System.out.println("Programa encerrado");

    }
}
