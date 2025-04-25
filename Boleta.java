// 3. Desarrolle una clase boleta que herede de documento. Esta clase debe adicionar las 
// propiedades dni, apellido y nombre.  

class Boleta extends Documento {
    private String dni;
    private String apellido;
    private String nombre;

    // Constructor
    public Boleta() {
        super(); // Llama al constructor de la clase padre (Documento)
        this.dni = ""; 
        this.apellido = ""; 
        this.nombre = ""; 
    }

    // Método para registrar una boleta
    public void registrarBoleta(int id, String direccion, String dni, String apellido, String nombre) {
        super.registrar(id, direccion); // Llama al método registrar de la clase padre
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public void Mostrar(){
        System.out.println("Id: " + getId());
        System.out.println("Dirección: " + getDireccion());
        System.out.println("DNI: " + dni);
        System.out.println("Apellido: " + apellido);
        System.out.println("Nombre: " + nombre);
    }

    public static void main(String[] args) {
        Boleta boleta = new Boleta();
        boleta.registrarBoleta(1, "Calle Falsa 123", "12345678", "Pérez", "Juan");
        boleta.Mostrar();
    }

}


