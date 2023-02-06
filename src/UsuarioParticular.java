public class UsuarioParticular extends Usuario{

    public UsuarioParticular(String nombre, String apellido, long cedula, String correoElectronico) {
        super(nombre, apellido, cedula, correoElectronico);
    }

    @Override
    public String obtenerTipo(){
        return "PARTICULAR";
    }
}
