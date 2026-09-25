package singleton;

public class ConfiguracionDelivery {

    private static ConfiguracionDelivery instancia;

    private String moneda;
    private double costoEnvioBase;

    private ConfiguracionDelivery() {
        moneda = "ARS";
        costoEnvioBase = 1000.0;
    }

    public static ConfiguracionDelivery getInstancia() {

        if (instancia == null) {
            instancia = new ConfiguracionDelivery();
        }

        return instancia;
    }

    public String getMoneda() {
        return moneda;
    }

    public double getCostoEnvioBase() {
        return costoEnvioBase;
    }
}