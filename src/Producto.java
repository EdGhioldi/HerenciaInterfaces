import java.time.LocalDate;

public class Producto {

    //Atributos
    private String nombre;
    private String descripcion;
    private LocalDate fechaAlta;
    private Integer pesoKg;
    private Double precio;
    private static final Double minPrecio = 0.1;

    //Constructores

    public Producto(String nombre) {
        this.nombre = nombre;
        this.fechaAlta = LocalDate.now();
        this.precio = minPrecio;
    }

    //Metodos

    public String getNombre(){
        return this.nombre;
    }
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    public String getDescripcion(){
        return this.descripcion;
    }
    public Double getPrecio() {
        return precio;
    }
    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    public LocalDate getFechaAlta() {return fechaAlta;}
    public Integer getPesoKg() {return pesoKg;}
    public void setPesoKg(Integer pesoKg) {this.pesoKg = pesoKg;}
}