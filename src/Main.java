
public class Main {
    public static void main(String[] args) {

        Usuario user1 = new UsuarioEps("Juan","Vélez",5289585,"juan@gmail.com");
        Usuario user2 = new UsuarioPoliza("Camila","Torres",52878485,"camila@gmail.com");
        Usuario user3 = new UsuarioParticular("Catalina","Morales",7889585,"catalina@gmail.com");

        Especialidad especialidad1 = new Especialidad("Fisioterapia",123,"Medicina del deporte");
        Especialidad especialidad2 = new Especialidad("Cita médico general",456,"Medicina General");
        Especialidad especialidad3 = new Especialidad("Cita médico general",456,"Medicina Interna");

        Hospital hospital = new Hospital(0);

        hospital.agendarCita(especialidad1, user1, "2023-02-08");
        hospital.agendarCita(especialidad2,user2,"2023-02-04");
        hospital.agendarCita(especialidad3,user3,"2023-03-03");


    }
}