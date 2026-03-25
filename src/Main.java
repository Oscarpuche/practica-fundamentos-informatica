import java.util.Date;

public class Main {
    public static void main(String[] args) { 
        /* VERSION BRUTA
        // Creamos el perfil 1 y la biografía asociada
        Perfil p1 = new Perfil("Pedro Gonzalez", "migatoluis0");
        Biografia b = new Biografia();
        Date fecha = new Date(74, 10, 17);
        b.setFechaDeNacimiento(fecha);
        b.setAficiones("los gatos");
        b.setProfesion("Informatico");
        b.setObjetivosVitales("Salvar animales");
        p1.setBiografia(b);

        // Creamos el perfil 2 y la biografía asociada
        Perfil p2 = new Perfil("Juan Perez", "lalalala");
        Biografia b2 = new Biografia();
        Date fecha2 = new Date(94, 2, 1);
        b2.setFechaDeNacimiento(fecha2);
        b2.setAficiones("Musica");
        b2.setProfesion("Albañil");
        b2.setObjetivosVitales("Recorrer el mundo");
        p2.setBiografia(b2);

        // Instancia de red social y añadimos los perfiles
        MiRed r = new MiRed();
        r.añadirPerfil(p1);
        r.añadirPerfil(p2);

        // Añadimos algunos posts a cada perfil
        r.añadirPost("user1", "Hoy me siento bien :)");
        r.añadirPost("user1", "Hoy me siento mal :(");
        r.añadirPost("user2", "Hoy me siento bien :)");
        r.añadirPost("user2", "Hoy me siento mal :(");

        */

        // Instancia de la red social
        MiRed r = new MiRed();

        // Creación de perfiles y biografías usando un bucle for 
        String[] Usuarios = {"Ana", "Luis", "Marta", "Carlos"};
        String[] passwords = {"password123", "password124", "password125", "password126"};
        Date fechas[] = {new Date(90, 0, 1), new Date(85, 5, 15), new Date(92, 10, 30),new Date(88, 3, 20)};
        String aficiones[] = {"Cocinar", "Viajar", "Deportes", "Lectura"};
        String profesiones[] = {"Chef", "Turista", "Atleta", "Escritor"};
        String posts[] = {"Hola a todos!", "¡Qué día tan maravilloso!", "¿Alguien quiere salir a correr?", "Acabo de terminar un libro increíble."};

        for (int i = 0; i < Usuarios.length; i++) {
            Perfil p = new Perfil(Usuarios[i], passwords[i]);
            Biografia b = new Biografia(fechas[i], aficiones[i], profesiones[i], "Objetivo de " + Usuarios[i]);
            p.setBiografia(b);
            r.añadirPerfil(p); 
            r.añadirPost("user" + (i + 1), posts[i]);
        }

        // Visualizamos la red social completa
        r.visualizarRed(); // Sacamos por pantalla los usuarios en la red
        System.out.println("-------------");
        r.visualizarPerfil("user56");
        System.out.println("-------------");
        r.visualizarPerfil("user1");
        System.out.println("-------------");
        r.comprobarPassword("user1", "migato");
        // r.visualizarPerfiles();
    }
}