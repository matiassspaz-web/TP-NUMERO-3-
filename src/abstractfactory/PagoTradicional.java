package abstractfactory;

public class PagoTradicional implements MetodoPago {

    @Override
    public void pagar() {
        System.out.println("Pago tradicional: efectivo o tarjeta");
    }
}