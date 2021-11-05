package mx.com.gm.mundopc;

public class Teclado extends DispositivoEntrada {

    private final int idTeclado;
    private static int contadorTeclados;

    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        //se inician los atributos de la clase hija
        this.idTeclado = ++Teclado.contadorTeclados;
    }

    @Override
    public String toString() {
        return "Teclado{" + "idTeclado=" + idTeclado + ", " + super.toString() + '}';
    }

}
