package adapter;

public class PasarelaPagoAdapter implements ProcesarPago {

    private PasarelaExterna pasarelaExterna;

    public PasarelaPagoAdapter(PasarelaExterna pasarelaExterna) {
        this.pasarelaExterna = pasarelaExterna;
    }

    @Override
    public void procesarPago(double monto) {
        pasarelaExterna.realizarTransaccion(monto);
    }
}