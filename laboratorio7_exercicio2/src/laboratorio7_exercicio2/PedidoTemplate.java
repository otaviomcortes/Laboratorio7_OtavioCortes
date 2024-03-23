package laboratorio7_exercicio2;

abstract class PedidoTemplate {
    public void processarPedido(int quantidadeItens, double valorItem, String formaPagamento) {
        double total = calcularTotal(quantidadeItens, valorItem);
        processarPagamento(total, formaPagamento);
        if (verificarEntrega()) {
            System.out.println("Entrega será realizada.");
        } else {
            System.out.println("Pedido disponível para retirada na loja.");
        }
    }

    protected abstract double calcularTotal(int quantidadeItens, double valorItem);
    protected abstract void processarPagamento(double total, String formaPagamento);
    protected boolean verificarEntrega() {
        return true;
    }
}