package pacientes;

// crear las clases, llamar a la clase principal e implementar la interfaz
public class PacienteAdulto extends pacientes implements Administracion, clinicamedica{

    private String nombre;
    private int edad;
    private double peso;
    private int Altura;

    // se definen los atributos del paciente adulto
    public PacienteAdulto(String nombre, int edad, double peso, int Altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.Altura = Altura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    public int Altura() {
        return Altura;
    }

    // implementar los metodos de las interfaces con <<implements>> y que se impriman en pantalla
    @Override
    public void asignarobrasocial() {
        System.out.println("posee obra social");
    }

    @Override
    public void asignardescuento() {
        System.out.println("no posee descuento");

    }

    @Override
    public void asignarcobertura() {
        System.out.println("posee cobertura");

    }

    @Override
    public void factorsangre() {
        System.out.println("su tipo de sangre es 0+");

    }
}
