public class DescuentoPorcentajeConTope implements Descuento {
    private double valor;
    private double tope;

    public DescuentoPorcentajeConTope(float valor, double tope) {
        this.valor = valor;
        this.tope = tope;
    }

    public double calcularDescuento(double precio) {
        double descuento;
        if (valor < 50) {
            descuento = precio * (valor / 100.0);
        } else {
            descuento = precio * 0.5;
        }
        if (descuento > tope) {
            descuento = tope;
        }
        return descuento;
    }
}