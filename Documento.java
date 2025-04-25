// 2. Desarrollo una clase documento que tenga las propiedades de id y dirección. Utilice 
// los tipos de dato apropiados para estas propiedades. Considere que está clase debe implementar 1 métodos: 
// a. registrar: mediante el cual se crea un documento con valores para sus propiedades. 

public class Documento {
    private int id;
    private String direccion;

    // Constructor
    public Documento() {
        this.id = 0;
        this.direccion = "";
    }

    // Método para registrar un documento
    public void registrar(int Id, String Direccion) {
        this.id = Id;
        this.direccion = Direccion;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getDireccion() {
        return direccion;
    }

    public static void main(String[] args) {
        Documento documento = new Documento();
        documento.registrar(1, "Calle Falsa 123");
        
        System.out.println("Id: " + documento.getId());
        System.out.println("Dirección: " + documento.getDireccion());
    }
}
