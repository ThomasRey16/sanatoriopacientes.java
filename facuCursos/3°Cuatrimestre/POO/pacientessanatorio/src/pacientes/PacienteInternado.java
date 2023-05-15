package pacientes;

// crear las clases, llamar a la clase principal e implementar la interfaz
public class PacienteInternado extends pacientes implements Administracion, Noticion, clinicamedica{

    private String nombre;
    private int numHabitacion;
    private double peso;

    // se definen los atributos del paciente internado
    public PacienteInternado(String nombre, int numHabitacion, double peso) {
        this.nombre = nombre;
        this.numHabitacion = numHabitacion;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumHabitacion() {
        return numHabitacion;
    }

    public double getPeso() {
        return peso;
    }

    // implementar los metodos de las interfaces con <<implements>> y que se impriman en pantalla
    @Override
    public void asignarobrasocial() {
        System.out.println("no posee obra social");
    }

    @Override
    public void asignardescuento() {
        System.out.println("posee descuento");
    }

    @Override
    public void asignarcobertura() {
        System.out.println("no posee cobertura");
    }

    @Override
    public void dieta() {
        System.out.println("no se asigna dieta");

    }

    @Override
    public void factorsangre() {
        System.out.println("su tipo de sangre es A+");
    }
}
