public class DescuentoPorcentajeConTope implements Descuento {
    // Atributo
    private double valor;
    private double tope;

    //Constructor
    public DescuentoPorcentajeConTope(double valor){
        this.valor = valor;
        this.tope = 40.0;
    }

    // Métodos
    public double calcularDescuento(double precio) {
        double descuento = (precio * valor) / 100.0;
        return Math.min(tope, descuento);

        /* Este método cumple la misma función que el anterior, pero es un poco más básico.

    public double calcularDescuento(double precio) {
        if (tope > (precio * valor) / 100.0) {
            return ((precio * valor) / 100.0);
        } else {
            return tope;
        }
    } */


}





}