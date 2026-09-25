package facade;

public class SistemaPedidos {

    private ValidarPedido validador;
    private ProcesadorPedido procesador;

    public SistemaPedidos() {
        validador = new ValidarPedido();
        procesador = new ProcesadorPedido();
    }

    public void realizarPedido() {
        validador.validar();
        procesador.procesar();

        System.out.println("Pedido realizado correctamente.");
    }
}