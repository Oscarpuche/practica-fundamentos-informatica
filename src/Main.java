import java.util.Date;

public class Main {
    public static void main(String[] args) { // String[] args es un parámetro que se utiliza para recibir argumentos desde la línea de comandos al ejecutar el programa
        
        // Creamos las instancias de Perfil y Biografia, y les otorgamos los valores de prueba del guión
        Perfil p = new Perfil();
        p.setIdUsuario("user10");
        p.setNombre("Pedro González");
        p.setURL("https://www.miRed.com/user1");
        p.setPassword("migatoluis0");

        Biografia b = new Biografia();
        Date fecha = new Date(74, 10, 17);
        b.setFechaDeNacimiento(fecha);
        b.setAficiones("Los gatos");
        b.setProfesion("Informático");
        b.setObjetivosVitales("Salvar animales");
        
        // Establecemos la relación de composición entre las clases Perfil y Biografia
        p.setBiografia(b); // Tomamos la instancia de Biografia b y la asignamos al atributo biografia del Perfil a través del método setBiografia()
        p.imprimeInformacion(); // Llamamos al método imprimeInformacion() del Perfil, que a su vez llama al método imprimeInformacion() de Biografia
    }
}