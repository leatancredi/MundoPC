
package mundopc;

import mx.com.gm.mundopc.*;


public class MundoPC {
    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP", 13);
        Teclado tecladoHP = new Teclado("bluetooth","HP");
        Raton ratonHP = new Raton("bluetooth", "HP");
        //relacionar clases "relacion de agregacion"
        Computadora computadoraHP = new Computadora("ComputadoraHP", monitorHP,tecladoHP,ratonHP);
        
        Monitor monitorGamer = new Monitor("Gamer", 13);
        Teclado tecladoGamer = new Teclado("bluetooth","HP");
        Raton ratonGamer = new Raton("bluetooth", "Gamer");
        //relacionar clases "relacion de agregacion"
        Computadora computadoraGamer = new Computadora("ComputadoraGamer", monitorGamer,tecladoGamer,ratonGamer);
        
        
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraGamer);
        
        orden1.mostarOrden();
    }
    
}
