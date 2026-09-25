package factorymethod;

public class PedidoFactory {

    public Pedido crearPedido(String tipo) {

        if (tipo.equalsIgnoreCase("comida")) {
            return new PedidoComida();

        } else if (tipo.equalsIgnoreCase("supermercado")) {
            return new PedidoSupermercado();
        }

        return null;
    }
}