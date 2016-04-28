
package org.primefaces.showcase.view.ajax;
 
import static com.sun.javafx.logging.PulseLogger.addMessage;
import javafx.event.ActionEvent;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;



@ManagedBean

public class login {
    private String usuario;
    private String clave;
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
 
     public void INGRESAR() {
        
    } 
   public void REGISTRARSE () {
        
   }
   
     public String Menu(){
        return "Registro.xhtml";    
     }
     public String Menup(){
         return "Menuprincipal.xhtml";
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

