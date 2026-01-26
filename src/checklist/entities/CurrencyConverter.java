package checklist.entities;

public class CurrencyConverter {

    public static final double IOF = 0.06;

    public static double reais(double dollar, double dollarPrice) {
        double valorEmReais = dollar * dollarPrice;
        double imposto = valorEmReais * IOF;
        return valorEmReais + imposto;
    }

}
