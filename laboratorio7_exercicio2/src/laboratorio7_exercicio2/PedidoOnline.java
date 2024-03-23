package laboratorio7_exercicio2;

class PedidoOnline extends PedidoTemplate {
    @Override
    protected double calcularTotal(int quantidadeItens, double valorItem) {
        return quantidadeItens * valorItem;
    }

    @Override
    protected void processarPagamento(double total, String formaPagamento) {
        if (formaPagamento.equals("criptomoedas")) {
            System.out.println("Pagamento de " + total + " unidades aceito via criptomoedas.");
        } else {
            System.out.println("Pagamento de " + total + " unidades processado.");
        }
    }
}