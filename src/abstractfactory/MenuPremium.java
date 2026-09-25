package abstractfactory;

public class MenuPremium implements Menu {

    @Override
    public void mostrarMenu() {
        System.out.println("Menú premium: sushi, salmón y platos gourmet");
    }
}