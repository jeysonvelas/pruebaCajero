package mx.com.gm.ventas.test;

import mx.com.gm.ventas.*;

public class VentasTest {

    public static void main(String[] args) {

        Producto producto1 = new Producto("Camisa","Camisa arturo calle, blanca manga larga", 50.00);
        Producto producto2 = new Producto("Pantalon","Pantalon Americanino en tela de dril", 150.00);
        Producto producto3 = new Producto("Sueter","Sueter tipo polo negro", 80.00);
        Producto producto4 = new Producto("jeans","Pantalon tela jeans de color azul", 200.00);
        Producto producto5 = new Producto("Bermuda","Bermuda semilarga de color rojo", 90.00);
        Producto producto6 = new Producto("Medias","Cortas de color negro", 30.00);
        Producto producto6 = new Producto("Medias","Cortas de color negro", 30.00);

        Orden o1 = new Orden();
        Orden o2 = new Orden();
        o1.agregarProducto(producto1);
        o2.agregarProducto(producto8);

        VistaPrueba v1 = new VistaPrueba();
        v1.setVisible(true);
        v1.setLocationRelativeTo(null);

    }
}
