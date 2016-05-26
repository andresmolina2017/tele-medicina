package negocio;

import entidades.registroVO;
import javax.ejb.Stateless;


@Stateless
public class registroBean implements registroBeanLocal {

    @Override
    public boolean registro(registroVO registro){
        System.out.print("hola desde registro");
        
        return true;
    }

    @Override
    public String obtenerRegistroUsuario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   // public boolean registro(registroVO registro) {
    //    return false;
    //}
   
    
}
