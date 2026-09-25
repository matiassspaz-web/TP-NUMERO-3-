package Decorator;

public class EnvioExpress extends ServicioDecorator {

    public EnvioExpress(ServicioDelivery servicio) {
        super(servicio);
    }

    @Override
    public double calcularCosto() {
        return servicio.calcularCosto() + 800.0;
    }

    @Override
    public String obtenerDescripcion() {
        return servicio.obtenerDescripcion() + " + Envío express";
    }
}