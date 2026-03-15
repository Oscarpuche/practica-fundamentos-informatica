public class Perfil {
    
    // Nombramos los atributos privados necesarios para la clase Perfil
    private String nombre;
    private String idUsuario;
    private String password;
    private String URL;
    
    // Establecemos la relación entre las clases Perfil y Biografia a través de un atributo de tipo Biografia
    private Biografia biografia;

    // Constructor vacío de la clase Perfil
    public Perfil() {
    }
    
    /* Constructor con parámetros de la clase Perfil para inicializar el nombre y la contraseña (Etapa2)
    public Perfil(String nombre, String password) {
        this.nombre = nombre;
        this.password = password;
    }
    */

    // Escribimos los métodos get y set para cada atributo de esta clase
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    // PREGUNTAR POR EL NÜMERO X QUE SE UNE AL IDUSUARIO
    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
        this.URL = "https://www.miRed.com/" + idUsuario; // Generamos la URL automáticamente a partir del idUsuario
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getURL() {
        return URL;
    }

    //PREGUNTAR SI DEJO ESTE MÉTODO O LO GENERO AUTOMATICAMENTE CON EL IDUSUARIO 
    public void setURL(String URL) {
        this.URL = URL;
    }

    public Biografia getBiografia() {
        return biografia;
    }

    public void setBiografia(Biografia biografia) {
        this.biografia = biografia;
    }

    // Escribimos el método para mostrar la información del perfil, que a su vez llama al método para mostrar la información de la biografía (indentamos para mantener el formato del guión)
    public void imprimeInformacion() {
        System.out.println("Identificador de usuario: " + idUsuario);
        System.out.println("   Nombre: " + nombre);
        System.out.println("   URL: " + URL);
        System.out.println("   BIO:");
        
        // Mostramos por pantalla la información de la biografía, relacionando ambas clases llamando al método imprimeInformacion() de la clase Biografia
        biografia.imprimeInformacion();
    }
}