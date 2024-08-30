public class Percentual {
    public static void main(String[] args) {
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48; 
        double outros = 19849.53;
        double total;

        total = (sp + rj + mg + es + outros);

        calculaPercentual(sp, total);

    }

    private static void calculaPercentual(double valor, double total)
    {
        double percentual = (valor/total) * 100;
        System.out.println("O valor percentual foi de: " + String.format("%.2f", percentual) + "%");

    }
}
