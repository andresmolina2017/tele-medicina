
package negocio;

import entidades.usuarioVO;
import javax.ejb.Local;


@Local
public interface RecuperarContrasenaBeanLocal {
    
    public boolean recuperar (usuarioVO usuario);
    public String recuperarContrasena();
}
