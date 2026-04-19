import java.util.Date;
import java.util.Scanner;

public class InterfazEtapa3 {

    private static Biografia leerBio(Scanner sc) {

        System.out.print("Ano nacimiento (ej 1974): ");
        int anio = Integer.parseInt(sc.nextLine());

        System.out.print("Mes nacimiento (1-12): ");
        int mes = Integer.parseInt(sc.nextLine());

        System.out.print("Dia nacimiento (1-31): ");
        int dia = Integer.parseInt(sc.nextLine());

        System.out.print("Profesion: ");
        String profesion = sc.nextLine();

        System.out.print("Aficiones: ");
        String aficiones = sc.nextLine();

        System.out.print("Objetivos vitales: ");
        String objetivos = sc.nextLine();

        Biografia b = new Biografia();
        b.setFechaDeNacimiento(new Date(anio - 1900, mes - 1, dia));
        b.setProfesion(profesion);
        b.setAficiones(aficiones);
        b.setObjetivosVitales(objetivos);

        return b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MiRed r = new MiRed();

        while (true) {

            System.out.println();
            System.out.println("1) Anadir perfil");
            System.out.println("2) Anadir post");
            System.out.println("3) Visualizar perfil");
            System.out.println("4) Salir");
            System.out.print("Opcion: ");

            String op = sc.nextLine();

            if (op.equals("1")) {

                System.out.print("Nombre: ");
                String nombre = sc.nextLine();

                System.out.print("Password: ");
                String password = sc.nextLine();

                Biografia b = leerBio(sc);

                System.out.print("Es profesional? (s/n): ");
                String prof = sc.nextLine().toLowerCase();

                Perfil p;

                if (prof.equals("s")) {

                    PerfilProfesional pp = new PerfilProfesional(nombre, password);

                    System.out.print("Curriculum: ");
                    pp.setCurriculum(sc.nextLine());

                    System.out.print("Ocupacion actual: ");
                    pp.setOcupacion(sc.nextLine());

                    p = pp;

                } else {

                    p = new Perfil(nombre, password);
                }

                p.setBiografia(b);
                r.añadirPerfil(p);
                r.visualizarRed();

            } else if (op.equals("2")) {

                r.visualizarRed();
                System.out.print("Identificador de usuario: ");
                String id = sc.nextLine();

                System.out.print("Password: ");
                String pw = sc.nextLine();

                if (r.comprobarPassword(id, pw)) {

                    System.out.print("Texto del post: ");
                    String texto = sc.nextLine();

                    r.añadirPost(id, texto);
                    r.visualizarPerfil(id);
                }

            } else if (op.equals("3")) {

                r.visualizarRed();
                System.out.print("Identificador de usuario: ");
                String id = sc.nextLine();
                r.visualizarPerfil(id);

            } else if (op.equals("4")) {
                break;
            } else {
                System.out.println("Opcion no valida");
            }
        }

        sc.close();
    }
}
