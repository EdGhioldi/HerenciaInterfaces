import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Persona {
    //Atributos
    private String nombre;
    private String apellido;
    private LocalDate fechaDeNacimiento;


    //Constructor
    public Persona(String nombre, String apellido, LocalDate fechaDeNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    //Metodos
    public String getNombre() {
        return this.nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public LocalDate getFechaDeNacimiento() {
        return this.fechaDeNacimiento;
    }

    public int Edad() {
        LocalDate fechaActual = LocalDate.now();
        return (int) ChronoUnit.YEARS.between(this.fechaDeNacimiento, fechaActual);
    }
}