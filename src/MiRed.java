import java.util.ArrayList;

public class MiRed {
    // Atributos de la clase MiRed, arraylist para guardar perfiles y un contador para asignar IDs únicos a cada usuario
    private ArrayList<Perfil> perfiles;
    private int contadorUsuarios; 

    public MiRed() {
        this.perfiles = new ArrayList<>();
        this.contadorUsuarios = 0; // iniciamos el contador en 0, se incrementará cada vez que añadamos un nuevo perfil
    }

    // Añade un perfil a la lista
    public void añadirPerfil(Perfil p) {
        contadorUsuarios++;
        p.setIdUsuario("user" + contadorUsuarios); // El id se genera aquí ya que es la red quién gestiona todos los perfiles
        this.perfiles.add(p);
    }

    private Perfil getUsuario(String idUsuario) {
        for (Perfil p : perfiles) {
            if (p.getIdUsuario().equals(idUsuario)) {
                return p;
            }
        }
        return null;
    }

    /*
    // Muestra la información de TODOS los usuarios registrados
    public void visualizarPerfiles() {
        System.out.println("--- LISTADO DE LA RED ---");
        for (Perfil p : perfiles) {
            p.imprimeInformacion();
            System.out.println("-------------------------");
        }
    }
    */

    public void visualizarRed() {
        System.out.println("Usuarios en la red:");
        for (Perfil p : perfiles) {
            System.out.println("   "+ p.getIdUsuario() + ": " + p.getNombre());}
        }


    // Busca un perfil por su ID y lo muestra
    public void visualizarPerfil(String idUsuario) {
        for (Perfil p : perfiles) {
            if (p.getIdUsuario().equals(idUsuario)) {
                p.imprimeInformacion();
                return;
            }
        }
        System.out.println("No existe el usuario " + idUsuario );
    }

    // POR QUÉ ES NECESARIO QUE SEA UN BOOLEANO SI SOLO VAMOS A IMPRIMIR POR PANTALLA SI LA CONTRASEÑA ES CORRECTA O NO?
    public boolean comprobarPassword(String idUsuario, String password) {
        Perfil p = getUsuario(idUsuario);
        if (!p.getPassword().equals(password)) {
            System.out.println("La password es incorrecta");
            return false;
        }
        else{
            System.out.println("Password correcta");
            return true;
        }
    }

    // Busca un usuario y le añade un nuevo comentario/post
    public void añadirPost(String idUsuario, String texto) {
        for (Perfil p : perfiles) {
            if (p.getIdUsuario().equals(idUsuario)) {
                p.añadirPost(texto);
                return;
            }
        }
    }
}
