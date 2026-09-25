package Decorator;
public class SeguroPedido extends ServicioDecorator {

    public SeguroPedido(ServicioDelivery servicio) {
        super(servicio);
    }

    @Override
    public double calcularCosto() {
        return servicio.calcularCosto() + 300.0;
    }

    @Override
    public String obtenerDescripcion() {
        return servicio.obtenerDescripcion() + " + Seguro del pedido";
    }
}