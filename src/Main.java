public class Main {

    public static void main(String[] args) {
        System.out.println("--------------------------------------------------");
        Cliente cliente = new Cliente();

        cliente.nombre = "Briane";
        cliente.edad = 45;
        cliente.telefono = 84258693;
        cliente.credito = 5000.3;
        System.out.println("Nombre cliente: "+cliente.nombre+
                "\nEdad: "+cliente.edad+
                "\nTelefono: "+cliente.telefono+
                "\nCredito: "+cliente.credito);
        System.out.println("--------------------------------------------------");
        Trabajador trabajador = new Trabajador();
        trabajador.nombre = "Alonso";
        trabajador.edad = 38;
        trabajador.telefono = 57854961;
        trabajador.salario = 987.5;
        System.out.println("Nombre trabajador: "+trabajador.nombre+
                "\nEdad: "+trabajador.edad+
                "\nTelefono: "+trabajador.telefono+
                "\nSalario: "+trabajador.salario);
        System.out.println("--------------------------------------------------");
    }
}

class Persona{
    String nombre;
    int edad;
    int telefono;

}

class Cliente extends Persona{
    double credito;
}

class Trabajador extends Persona {
    double salario;
}