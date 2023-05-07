public class DescuentoPorcentaje implements Descuento{

    //Atributo
    private double valor;

    //Constructor
    public DescuentoPorcentaje(double valor){
        this.valor = valor;
    }

    //Metodo
    public double calcularDescuento(double precio) {
        return (precio * valor) / 100.0;
    }
}
