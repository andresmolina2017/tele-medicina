
package org.primefaces.showcase.view.ajax;
 
import static com.sun.javafx.logging.PulseLogger.addMessage;
import entidades.UsuarioVO;
import javafx.event.ActionEvent;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import negocio.AutentificacionBeanLocal;



@ManagedBean

public class login {
    private UsuarioVO usuario = new UsuarioVO();
    private String email;
    
    @EJB
    private AutentificacionBeanLocal auteticarBean;

    public UsuarioVO getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioVO usuario) {
        this.usuario = usuario;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
     public void INGRESAR() {
        
    } 
   public void REGISTRARSE () {
        
   }
   
     public String Menu(){
        return "Registro.xhtml";    
     }
     public String Menup(){
         
         //Llamar al EJB de autenticacion
         
         if(auteticarBean.autentificar(usuario))
            return "Menuprincipal.xhtml";
         else
             return "";
         
         
         
         
         
         
     }
     public String Index(){
         return "Index.xhtml";
     }
     public String Conocenos(){
         return "Conocenos.xhtml";
     }
     public String Recuperacion(){
         return "RecuperacionClave.xhtml";
     }
     public void Email(ActionEvent actionEvent) {
        addMessage(" Mensaje envia a correo electronico!!");
    }
}

