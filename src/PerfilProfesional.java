public class PerfilProfesional extends Perfil{
    private String curriculum;
    private String ocupacion;

    public PerfilProfesional (String nombre, String password) {
        super(nombre, password);
        this.curriculum = "";
        this.ocupacion = "";
    }

    public void setCurriculum(String curriculum) {this.curriculum = curriculum;}
    public void setOcupacion(String ocupacion) {this.ocupacion = ocupacion;}

    @Override
    public void imprimeInformacion() {
        System.out.println("Perfil profesional");
        super.imprimeInformacion();
        
        System.out.println("Ocupacion actual: " + ocupacion);
        System.out.println("Curriculum: " + curriculum);
    }

}
