package factorymethod;

public class PedidoComida implements Pedido {

    @Override
    public void entregar() {
        System.out.println("Entregando pedido de comida");
    }
}