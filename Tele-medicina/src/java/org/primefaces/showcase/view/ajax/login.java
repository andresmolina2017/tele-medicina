
package org.primefaces.showcase.view.ajax;
 
import javafx.event.ActionEvent;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;



@ManagedBean

public class login {
    private String usuario;
    private String clave;

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
    }

