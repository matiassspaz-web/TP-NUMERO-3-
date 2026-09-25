package abstractfactory;

public class MenuTradicional implements Menu {

    @Override
    public void mostrarMenu() {
        System.out.println("Menú tradicional: hamburguesa, pizza y empanadas");
    }
}