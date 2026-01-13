package estruturas_cond;

public class condTernaria {
    public static void main(String[] args){

        // double preco = 34.5;
        // double desconto;

        // if(preco < 20.0) {
        //     desconto = preco * 0.1;
        // }
        // else {
        //     desconto = preco * 0.05;
        
        double preco = 34.5;
        double desconto = (preco < 20.00) ? preco * 0.1 : preco * 0.05;
    }
}
