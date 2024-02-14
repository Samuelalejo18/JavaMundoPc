/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package my.proyecto.taller1;



/**
 *
 * @author Usuario
 */

public class AplMain {

    public static void main(String[] args) {


        Raton mause1 = new Raton("Lenovo", "MicroUsb", "Blanco");
        Teclado teclado1 = new Teclado("Logitech", "TipoC", "RGB");
        Monitor monitor1 = new Monitor("LG", "24 in");
        Computadora Asus = new Computadora("Asus pro 12", monitor1, teclado1, mause1);
        Orden orden1 = new Orden();
        orden1.agregarComputadora(Asus);
        orden1.mostrarOrden();

        Raton mause2 = new Raton("Dell", "TipoC", "Negro");
        Teclado teclado2 = new Teclado("Red Dragon", "Usb", "Rojo");
        Monitor monitor2 = new Monitor("Samsung", "32 in");
        Computadora Lenovo = new Computadora("Lenovo idepadGaming", monitor2, teclado2, mause2);
        Orden orden2 = new Orden();
        orden2.agregarComputadora(Lenovo);
        orden2.mostrarOrden();


        }

}
