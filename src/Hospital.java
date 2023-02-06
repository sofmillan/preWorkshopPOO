public class Hospital {
    private int valorBase;

    public Hospital(int valorBase) {
        this.valorBase = valorBase;
    }

    public void agendarCita( Especialidad especialidad, Usuario usuario, String fecha){
        if(usuario instanceof UsuarioEps){
            this.valorBase = 30000;
        }else if(usuario instanceof UsuarioPoliza){
            this.valorBase = 40000;
        }else if( usuario instanceof UsuarioParticular){
            this.valorBase = 70000;
        }

        System.out.println(usuario.getNombre()+" "+usuario.getApellido()+ " su cita ha sido agendada para "+fecha+" \n El valor a pagar es "+this.valorBase+" con "+especialidad.getNombre() );
    }
}
