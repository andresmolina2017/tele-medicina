package negocio;

import entidades.usuarioVO;
import javax.ejb.Stateless;


@Stateless
public class AutentificacionBean implements AutentificacionBeanLocal {

    @Override
    public boolean autentificar(usuarioVO usuario) {
        System.out.println("Hola desde autentucar");

        return true;

    }

    @Override
    public String obtenerNombreUsuario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean autenticar(usuarioVO usurario) {
        return false;

    }
}
