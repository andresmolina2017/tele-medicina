package ManagedBean;

import javafx.event.ActionEvent;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import negocio.registroBeanLocal;
import relacionBD.Pacientes;

@ManagedBean

public class registro {
    

    private Pacientes pacinte;
    private String usuario;
    private String clave;
    private String repitaclave;
    private String nombres;
    private String apellidos;
    private String console;
    
    @EJB
    private registroBeanLocal registrarBean;
    
    public String getConsole() {
        return console;
    }

    public void setConsole(String console) {
        this.console = console;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getRepitaclave() {
        return repitaclave;
    }

    public void setRepitaclave(String repitaclave) {
        this.repitaclave = repitaclave;
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

    public void REGISTRARSE() {

    }

    public String Confirmar() {
         
        // llamar al EJB de registro
        
        if(registrarBean.registrar(pacinte))
          return "Menuprincipal.xhtml";
        else
          return "";
            
    }

    public String Cancelar() {
        return "Logout.xhtml";
    }

    public String registro() {
        return "exitoso";
    }

    public Pacientes getPacinte() {
        return pacinte;
    }

    public void setPacinte(Pacientes pacinte) {
        this.pacinte = pacinte;
    }
}
