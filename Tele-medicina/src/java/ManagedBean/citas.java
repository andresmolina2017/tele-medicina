
package ManagedBean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@RequestScoped
public class citas {
    private String ndcita;
    private Integer nddocumento;
    private String nombre;
    private String apellido;
    private Integer horainicial;
    private Integer horafinal;
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    
    

    public Integer getHorainicial() {
        return horainicial;
    }

    public void setHorainicial(Integer horainicial) {
        this.horainicial = horainicial;
    }

    public Integer getHorafinal() {
        return horafinal;
    }

    public void setHorafinal(Integer horafinal) {
        this.horafinal = horafinal;
    }
    
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
        public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNddocumento() {
        return nddocumento;
    }

    public void setNddocumento(Integer nddocumento) {
        this.nddocumento = nddocumento;
    }
      
    public String getNdcita() {
        return ndcita;
    }

    public void setNdcita(String ndcita) {
        this.ndcita = ndcita;
    }
    
    public void AGREGAR() {
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(" EXITOSAMENTE SE HA AGREGADO TU CITA "));
    }
    public void MODIFICAR() {
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(" EXITOSAMENTE SE HA AGREGADO TU CITA "));
    }
     public void CONSULTAR() {
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(" CONSULTA DE SU CITA "));
     }
     
    
     public String CANCELAR() {
     return "Logout.xhtml"; 
   
     }
    
}
