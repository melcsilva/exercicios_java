package orientacaobjetos.entities;

public class ContaBancaria {
    public String nome;
    public int conta;
    public double saldoAtual;

    public void depositar(double deposito){
       saldoAtual += deposito;
    }

    public void sacar(double sacar){
        double valorTotal = sacar + 5.00;
        if (saldoAtual >= valorTotal) {
            saldoAtual -= valorTotal;
        }
    }
}
