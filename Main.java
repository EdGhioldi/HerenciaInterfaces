import java.time.*;

public class Main {
    public static void main(String[] args) {

        //Crear Objeto Persona
        Persona persona1 = new Persona("Mariana", "Gomez", LocalDate.of(1989, 10, 1));

        //Crear Objeto Producto 1
        Producto prod1 = new Producto("Jabón en Polvo");
        prod1.setDescripcion("Art. de Limpieza");
        prod1.setPrecio(40.0);

        //Crear Objeto Producto 2
        Producto prod2 = new Producto("Esponjas");
        prod2.setDescripcion("Art. de Limpieza");
        prod2.setPrecio(10.0);

        //Crear Objeto Producto 3
        Producto prod3 = new Producto("Chocolates");
        prod3.setDescripcion("Alimentos");
        prod3.setPrecio(100.0);

        //Crear Objeto Carrito
        Carrito c1 = new Carrito(persona1);
        c1.setProducto(new Producto[]{prod1, prod2, prod3});

        System.out.println("El precio de su Carrito hasta aquí es de: $" + c1.precio());


        // Crear objeto Descuento y asignarlo al carrito
        Descuento descuento = new DescuentoPorcentajeConTope(5);
        c1.setDescuentoSeleccionado(descuento);

        double precioConDescuento = c1.precio();

        System.out.println("El precio final de su Carrito es de: $" + precioConDescuento);
    }
}
