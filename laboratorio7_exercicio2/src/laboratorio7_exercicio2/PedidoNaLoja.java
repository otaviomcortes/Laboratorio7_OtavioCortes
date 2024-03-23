package laboratorio7_exercicio2;

class PedidoNaLoja extends PedidoTemplate {
    @Override
    protected double calcularTotal(int quantidadeItens, double valorItem) {
        return quantidadeItens * valorItem;
    }

    @Override
    protected void processarPagamento(double total, String formaPagamento) {
        System.out.println("Pagamento de " + total + " unidades na loja.");
    }

    @Override
    protected boolean verificarEntrega() {
        return false;
    }
}