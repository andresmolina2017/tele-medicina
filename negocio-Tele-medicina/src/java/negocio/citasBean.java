
package negocio;

import entidades.registroVO;
import javax.ejb.Stateless;


@Stateless
public class citasBean implements citasBeanLocal {
    
    @Override
   public boolean citas (registroVO registro){
       System.out.println("hola desde cita ");
       
       return true;
       
   }
   
   @Override
   public String obtenerCita(){
       throw new UnsupportedOperationException("Not supported yet."); 
   }
   
  
    
}
