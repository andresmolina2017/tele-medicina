
package ManagedBean;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;


@ManagedBean
class Recuperar {
    
     private String correo;
    
    @EJB
    private Recuperar ejbrecuperar;

    
    
    
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
   
    
}
