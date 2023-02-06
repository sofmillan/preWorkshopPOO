public class UsuarioEps extends Usuario{
    public UsuarioEps(String nombre, String apellido, long cedula, String correoElectronico) {
        super(nombre, apellido, cedula, correoElectronico);
    }
    @Override
    public String obtenerTipo(){
        return "EPS";
    }
}
