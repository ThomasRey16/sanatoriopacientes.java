package pacientes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// crear la clase principal (main) y lista de los pacientes
 public class pacientes {


    public static void main(String[] args) {


        List<Object> listaPacientes = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        // imprimir paciente pediátrico

        System.out.println("Ingrese los datos del paciente pediátrico:");
        System.out.print("Nombre: ");
        String nombrePediatrico = scanner.nextLine();
        System.out.print("Tutor: ");
        String tutor = scanner.nextLine();
        System.out.print("Teléfono: ");
        String telefono = scanner.nextLine();
        System.out.print("Peso: ");
        double pesoPediatrico = scanner.nextDouble();
        scanner.nextLine();

        PacientePediatrico pacientePediatrico = new PacientePediatrico(nombrePediatrico, tutor, telefono, pesoPediatrico);
        listaPacientes.add(pacientePediatrico);

        // imprimir la interfaz
        pacientePediatrico.asignarobrasocial();
        pacientePediatrico.asignardescuento();
        pacientePediatrico.asignarcobertura();
        pacientePediatrico.dieta();

        // imprimir paciente internado

        System.out.println("\nIngrese los datos del paciente internado:");
        System.out.print("Nombre: ");
        String nombreInternado = scanner.nextLine();
        System.out.print("Número de habitación: ");
        int numHabitacion = scanner.nextInt();
        System.out.print("Peso: ");
        double pesoInternado = scanner.nextDouble();
        scanner.nextLine();

        PacienteInternado pacienteInternado = new PacienteInternado(nombreInternado, numHabitacion, pesoInternado);
        listaPacientes.add(pacienteInternado);

        // imprimir interfaz
        pacienteInternado.asignarobrasocial();
        pacienteInternado.asignarcobertura();
        pacienteInternado.asignardescuento();
        pacienteInternado.dieta();
        pacienteInternado.factorsangre();

        // imprimir paciente adulto

        System.out.println("\nIngrese los datos del paciente adulto:");
        System.out.println("Nombre: ");
        String nombreAdulto = scanner.nextLine();
        System.out.println("Edad: ");
        int Edad = scanner.nextInt();
        System.out.println("peso");
        double pesoAdulto = scanner.nextDouble();
        System.out.println("Altura: ");
        int Altura = scanner.nextInt();
        scanner.nextLine();

        PacienteAdulto pacienteAdulto = new PacienteAdulto(nombreAdulto, Edad, pesoAdulto, Altura);
        listaPacientes.add(pacienteAdulto);

        // imprimir la interfaz
        pacienteAdulto.asignarobrasocial();
        pacienteAdulto.asignarcobertura();
        pacienteAdulto.asignardescuento();
        pacienteAdulto.factorsangre();
    }
}
