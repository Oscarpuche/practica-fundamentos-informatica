import java.util.ArrayList;

public class MiRed {
    // Atributo para almacenar todos los perfiles de la red
    private ArrayList<Perfil> perfiles;
    private int contadorUsuarios; 

    public MiRed() {
        this.perfiles = new ArrayList<>();
        this.contadorUsuarios = 0;
    }

    // Añade un perfil a la lista
    public void añadirPerfil(Perfil p) {
        contadorUsuarios++;
        p.setIdUsuario("user" + contadorUsuarios); // Esto activa la URL
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
    // Muestra la información de todos los usuarios registrados
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

    */
    public void visualizarRed() {
        System.out.println("Usuarios en la red:");
        for (Perfil p : perfiles) {
            System.out.println(p.getIdUsuario() + ": " + p.getNombre());
        }
    */

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
