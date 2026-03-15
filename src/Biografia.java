import java.util.Date;

public class Biografia {
    
    // Nombramos los atributos privados necesarios para la clase Biografia
    private Date fechaDeNacimiento;
    private String aficiones;
    private String profesion;
    private String objetivosVitales;

    // Creamos un constructor vacío para la clase biografía
    public Biografia() {
    }

    /* Al igual que en la Clase Perfil, creamos un constructor para la clase Biografia con sus atributos como parametros
    public Biografia(Date fechaDeNacimiento, String aficiones, String profesion, String objetivosVitales) {
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.aficiones = aficiones;
        this.profesion = profesion;
        this.objetivosVitales = objetivosVitales;
    }
    */

    // Escribimos los métodos get y set para cada atributo de esta clase
    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getAficiones() {
        return aficiones;
    }

    public void setAficiones(String aficiones) {
        this.aficiones = aficiones;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getObjetivosVitales() {
        return objetivosVitales;
    }

    public void setObjetivosVitales(String objetivosVitales) {
        this.objetivosVitales = objetivosVitales;
    }

    // Escribimos el método para mostrar la información de la biografía (indentamos para mantener el formato del guión)
    public void imprimeInformacion() {
        System.out.println("      Fecha de nacimiento: " + fechaDeNacimiento);
        System.out.println("      Profesión: " + profesion);
        System.out.println("      Aficiones: " + aficiones);
        System.out.println("      Objetivos vitales: " + objetivosVitales);
    }
}