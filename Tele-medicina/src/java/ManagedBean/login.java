
package ManagedBean;
 
import static com.sun.javafx.logging.PulseLogger.addMessage;
import entidades.autentificacion;
import entidades.usuarioVO;
import javafx.event.ActionEvent;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import negocio.AutentificacionBeanLocal;
import static relacionBD.Pacientes_.usuario;



@ManagedBean(name = "creacionUsuarioMB")

public class login {
    
    @EJB
    private AutentificacionBeanLocal auteticarBean;
    
    private usuarioVO usuario = new usuarioVO();
    private String email;
    private autentificacion a;
    

    public usuarioVO getUsuario() {
        return usuario;
    }

    public void setUsuario(usuarioVO usuario) {
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
         
       // if(auteticarBean.autentificar(a))
            return "Menuprincipal.xhtml";
         //else
           //  return "";  
         
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

