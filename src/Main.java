public class Main {
    public static void main(String[] args) {
        AtividadeMedia am = new AtividadeMedia();

        am.calculoMediaEnquantoPositivo();

        CrescimentoPopulacional cp =
                new CrescimentoPopulacional(
                        5000000,
                        7000000,
                        .03,
                        .02);
        cp.calcularTaxaDeCrescimento();
    }
}