package orientacaobjetos.entities;

public class ContaBancaria {
    public String nome;
    private int conta;
    private double saldoAtual;

    public void depositar(double deposito) {
        saldoAtual += deposito;
    }

    public void sacar(double sacar) {
        double valorTotal = sacar + 5.00;
        if (saldoAtual >= valorTotal) {
            saldoAtual -= valorTotal;
        }
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public int getConta() {
        return conta;
    }

    public void setSaldoAtual(double saldoAtual) {
        this.saldoAtual = saldoAtual;
    }

    public double getSaldoAtual() {
        return saldoAtual;
    }
}

