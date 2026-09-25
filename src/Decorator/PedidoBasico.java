package Decorator;

public class PedidoBasico implements ServicioDelivery {

    @Override
    public double calcularCosto() {
        return 1000.0;
    }

    @Override
    public String obtenerDescripcion() {
        return "Pedido básico";
    }
}