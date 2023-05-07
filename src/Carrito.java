import java.time.LocalDate;

public class Carrito {

    //Atributos
    private Persona persona;
    private Producto[] productos;
    private LocalDate fecha;
    private double precio;
    private Descuento descuento;

    //Constructor
    public Carrito(Persona persona){
        this.persona = persona;
        this.productos = new Producto[3];
        this.fecha = LocalDate.now();
        this.descuento = null;
    }

    //Metodo

    public Persona getPersona() {
        return persona;
    }
    public Producto[] getProducto() {
        return productos;
    }
    public void setProducto(Producto[] producto) {
        this.productos = producto;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public double precio() {
        double precioTotal = 0;
        for (int i = 0; i < productos.length; i++) {
            if (productos[i] != null) {
                precioTotal += productos[i].getPrecio();
            }
        }
        return precioTotal;
    }
}