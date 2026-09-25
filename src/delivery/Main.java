package delivery;

import singleton.ConfiguracionDelivery;

import factorymethod.Pedido;
import factorymethod.PedidoFactory;

import abstractfactory.DeliveryFactory;
import abstractfactory.DeliveryFactoryTradicional;
import abstractfactory.DeliveryFactoryPremium;
import abstractfactory.Menu;
import abstractfactory.MetodoPago;

import adapter.PasarelaExterna;
import adapter.PasarelaPagoAdapter;
import adapter.ProcesarPago;

import Decorator.EnvioExpress;
import Decorator.PedidoBasico;
import Decorator.SeguroPedido;
import Decorator.ServicioDelivery;

import facade.SistemaPedidos;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== SINGLETON ===");

        ConfiguracionDelivery config = ConfiguracionDelivery.getInstancia();

        System.out.println("Moneda: " + config.getMoneda());
        System.out.println("Costo de envío base: $" + config.getCostoEnvioBase());


        System.out.println("\n=== FACTORY METHOD ===");

        PedidoFactory factory = new PedidoFactory();

        Pedido pedidoComida = factory.crearPedido("comida");
        pedidoComida.entregar();

        Pedido pedidoSupermercado = factory.crearPedido("supermercado");
        pedidoSupermercado.entregar();


        System.out.println("\n=== ABSTRACT FACTORY ===");

        DeliveryFactory factoryTradicional = new DeliveryFactoryTradicional();

        Menu menuTradicional = factoryTradicional.crearMenu();
        MetodoPago pagoTradicional = factoryTradicional.crearMetodoPago();

        menuTradicional.mostrarMenu();
        pagoTradicional.pagar();

        DeliveryFactory factoryPremium = new DeliveryFactoryPremium();

        Menu menuPremium = factoryPremium.crearMenu();
        MetodoPago pagoPremium = factoryPremium.crearMetodoPago();

        menuPremium.mostrarMenu();
        pagoPremium.pagar();


        System.out.println("\n=== ADAPTER ===");

        PasarelaExterna pasarelaExterna = new PasarelaExterna();

        ProcesarPago procesadorPago =
                new PasarelaPagoAdapter(pasarelaExterna);

        procesadorPago.procesarPago(2500.0);


        System.out.println("\n=== DECORATOR ===");

        ServicioDelivery pedido = new PedidoBasico();

        pedido = new EnvioExpress(pedido);
        pedido = new SeguroPedido(pedido);

        System.out.println(pedido.obtenerDescripcion());
        System.out.println("Costo total: $" + pedido.calcularCosto());


        System.out.println("\n=== FACADE ===");

        SistemaPedidos sistema = new SistemaPedidos();

        sistema.realizarPedido();
    }
}