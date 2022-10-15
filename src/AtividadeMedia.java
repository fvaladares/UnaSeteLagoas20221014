import java.util.Scanner;

public class AtividadeMedia {

    private double lerValor() {
        Scanner reader = new Scanner(System.in);
        double entrada = 0;
        System.out.println(
                "Por favor, informe um número:" +
                        " (-1 para interromper)");
        System.out.print(":: ");
        entrada = reader.nextDouble();

        return entrada;
    }

    public void calculoMediaEnquantoPositivo() {
        double acumulador = 0;
        int contador = 0;
        double media = 0;
        double entrada = 0;

        entrada = lerValor();

        while (entrada >= 0) {
            acumulador += entrada;
            contador++;
            entrada = lerValor();
        }

        if (contador != 0) {
            media = acumulador / contador;
            System.out.println("A média dos números informados é: " +
                    media);
        } else {
            System.out.println("Não foi possível determinar a média.");
        }
    }
}
