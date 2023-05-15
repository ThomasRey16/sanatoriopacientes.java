package pacientes;

// crear las clases, llamar a la clase principal e implementar la interfaz
public class PacientePediatrico extends pacientes implements Administracion, Noticion {

    private String nombre;
    private String tutor;
    private String telefono;
    private double peso;

// se definen los atributos del paciente pediatrico
    public PacientePediatrico(String nombre, String tutor, String telefono, double peso) {
        this.nombre = nombre;
        this.tutor = tutor;
        this.telefono = telefono;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTutor() {
        return tutor;
    }

    public String getTelefono() {
        return telefono;
    }

    public double getPeso() {
        return peso;
    }

    // implementar los metodos de las interfaces con <<implements>> y que se impriman en pantalla
    @Override
    public void asignarobrasocial() {
        System.out.println("posee obra social");
    }

    @Override
    public void asignardescuento() {
        System.out.println("posee descuento");

    }

    @Override
    public void asignarcobertura() {
        System.out.println("posee cobertura");
    }

    @Override
    public void dieta() {
        System.out.println("se asigna dieta");

    }
}
