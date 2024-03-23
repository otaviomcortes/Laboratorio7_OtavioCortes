package laboratorio7_exercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //O padrão de projeto Template define uma estrutura de algoritmo em uma superclasse, permitindo que subclasses 
        //forneçam implementações específicas para partes do algoritmo, enquanto o padrão Decorator permite 
        //adicionar responsabilidades adicionais a um objeto dinamicamente, envolvendo-o em uma
        //série de objetos decoradores, sem alterar sua interface original.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de itens: ");
        int quantidadeItens = scanner.nextInt();

        System.out.print("Digite o valor de cada item: ");
        double valorItem = scanner.nextDouble();

        System.out.print("Pedido feito (online/na loja): ");
        String formaPedido = scanner.next();

        System.out.print("Forma de pagamento (criptomoedas/outro): ");
        String formaPagamento = scanner.next();

        PedidoTemplate pedido;
        if (formaPedido.equals("online")) {
            pedido = new PedidoOnline();
        } else {
            pedido = new PedidoNaLoja();
        }

        pedido.processarPedido(quantidadeItens, valorItem, formaPagamento);
    }
}