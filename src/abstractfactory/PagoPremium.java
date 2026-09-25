package abstractfactory;

public class PagoPremium implements MetodoPago {

    @Override
    public void pagar() {
        System.out.println("Pago premium: tarjeta premium o billetera virtual");
    }
}