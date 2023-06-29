public class UsuarioCRUD extends Usuario {
    private String nombresuario, usuario, password;

    public UsuarioCRUD(){}
    public UsuarioCRUD(String nombresuario, String usuario, String password){
        this.nombresuario=nombresuario;
        this.usuario=usuario;
        this.password=password;
    }

    public String getNombresuario() {
        return nombresuario;
    }
    public void setNombresuario(String nombresuario) {
        this.nombresuario = nombresuario;
    }
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }




    
    @Override
    public String eliminarUsuario() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminarUsuario'");
    }

    @Override
    public String registrarUsuario() {
        return nombresuario + " " + usuario + " " + password;
    }
    
}
