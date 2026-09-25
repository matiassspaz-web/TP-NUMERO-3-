package Decorator;

public abstract class ServicioDecorator implements ServicioDelivery {

    protected ServicioDelivery servicio;

    public ServicioDecorator(ServicioDelivery servicio) {
        this.servicio = servicio;
    }

    @Override
    public double calcularCosto() {
        return servicio.calcularCosto();
    }

    @Override
    public String obtenerDescripcion() {
        return servicio.obtenerDescripcion();
    }
}