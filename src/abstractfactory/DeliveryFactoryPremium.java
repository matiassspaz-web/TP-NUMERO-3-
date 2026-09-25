package abstractfactory;

public class DeliveryFactoryPremium implements DeliveryFactory {

    @Override
    public Menu crearMenu() {
        return new MenuPremium();
    }

    @Override
    public MetodoPago crearMetodoPago() {
        return new PagoPremium();
    }
}