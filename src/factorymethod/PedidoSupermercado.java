package factorymethod;

public class PedidoSupermercado implements Pedido {

    @Override
    public void entregar() {
        System.out.println("Entregando pedido de supermercado");
    }
}