
package negocio;

import entidades.usuarioVO;
import javax.ejb.Stateless;


@Stateless
public class RecuperarContrasenaBean implements RecuperarContrasenaBeanLocal {
    
    @Override
    public boolean recuperar(usuarioVO email) {
        System.out.println("Hola desde recuperar");

        return true;

    }

    @Override
    public String recuperarContrasena() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    }
    

    

