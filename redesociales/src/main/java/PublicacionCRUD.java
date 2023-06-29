public class PublicacionCRUD extends Publicacion {

    private String usuario, publicacion;

    public PublicacionCRUD(){}
    public PublicacionCRUD(String usuario, String publicacion){
        this.publicacion=publicacion;
        this.usuario=usuario;
    }

    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getPublicacion() {
        return publicacion;
    }
    public void setPublicacion(String publicacion) {
        this.publicacion = publicacion;
    }



    @Override
    public String eliminarPublicacion() {
         // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminarPublicacion'");
    }

    @Override
    public String registrarPublicacion() {
        return usuario+" "+publicacion;
    }
    
}
