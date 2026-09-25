package abstractfactory;

public class DeliveryFactoryTradicional implements DeliveryFactory {

    @Override
    public Menu crearMenu() {
        return new MenuTradicional();
    }

    @Override
    public MetodoPago crearMetodoPago() {
        return new PagoTradicional();
    }
}