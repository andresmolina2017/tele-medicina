package negocio;

import entidades.registroVO;
import javax.ejb.Local;

@Local
public interface registroBeanLocal {
    
    public boolean registro(registroVO registro);
    public String obtenerRegistroUsuario();
    
    
    
}
