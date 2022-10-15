public class CrescimentoPopulacional {
    private final int cidadeA;
    private final int cidadeB;
    private final double taxaCrescimentoA;
    private final double taxaCrescimentoB;


    public CrescimentoPopulacional(
            int cidadeA,
            int cidadeB,
            double taxaCrescimentoA,
            double taxaCrescimentoB) {
        this.cidadeA = cidadeA;
        this.cidadeB = cidadeB;
        this.taxaCrescimentoA = taxaCrescimentoA;
        this.taxaCrescimentoB = taxaCrescimentoB;
    }

    public void calcularTaxaDeCrescimento() {
        int populacaoA = cidadeA;
        int populacaoB = cidadeB;
        int count = 0;

        while (populacaoA <= populacaoB) {
            populacaoA += (populacaoA * taxaCrescimentoA);
            populacaoB += (populacaoB * taxaCrescimentoB);
            System.out.println("População A: " + populacaoA);
            System.out.println("População B: " + populacaoB);
            count++;
        }

        System.out.printf("Foram necessários %d anos para a " +
                "população de A ultrapassar a população B", count);

    }
}
