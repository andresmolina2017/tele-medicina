/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionBase;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author carlos andres
 */
@Entity
@Table(name = "cita")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cita.findAll", query = "SELECT c FROM Cita c"),
    @NamedQuery(name = "Cita.findByIdCita", query = "SELECT c FROM Cita c WHERE c.idCita = :idCita"),
    @NamedQuery(name = "Cita.findByTipoCita", query = "SELECT c FROM Cita c WHERE c.tipoCita = :tipoCita"),
    @NamedQuery(name = "Cita.findByIdCentroMedico", query = "SELECT c FROM Cita c WHERE c.idCentroMedico = :idCentroMedico"),
    @NamedQuery(name = "Cita.findByHoraInicial", query = "SELECT c FROM Cita c WHERE c.horaInicial = :horaInicial"),
    @NamedQuery(name = "Cita.findByHoraFinal", query = "SELECT c FROM Cita c WHERE c.horaFinal = :horaFinal"),
    @NamedQuery(name = "Cita.findByNumeroDocumento", query = "SELECT c FROM Cita c WHERE c.numeroDocumento = :numeroDocumento")})
public class Cita implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idCita")
    private Integer idCita;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "tipoCita")
    private String tipoCita;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idCentroMedico")
    private int idCentroMedico;
    @Basic(optional = false)
    @NotNull
    @Column(name = "horaInicial")
    @Temporal(TemporalType.TIME)
    private Date horaInicial;
    @Basic(optional = false)
    @NotNull
    @Column(name = "horaFinal")
    @Temporal(TemporalType.TIME)
    private Date horaFinal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "numeroDocumento")
    private int numeroDocumento;

    public Cita() {
    }

    public Cita(Integer idCita) {
        this.idCita = idCita;
    }

    public Cita(Integer idCita, String tipoCita, int idCentroMedico, Date horaInicial, Date horaFinal, int numeroDocumento) {
        this.idCita = idCita;
        this.tipoCita = tipoCita;
        this.idCentroMedico = idCentroMedico;
        this.horaInicial = horaInicial;
        this.horaFinal = horaFinal;
        this.numeroDocumento = numeroDocumento;
    }

    public Integer getIdCita() {
        return idCita;
    }

    public void setIdCita(Integer idCita) {
        this.idCita = idCita;
    }

    public String getTipoCita() {
        return tipoCita;
    }

    public void setTipoCita(String tipoCita) {
        this.tipoCita = tipoCita;
    }

    public int getIdCentroMedico() {
        return idCentroMedico;
    }

    public void setIdCentroMedico(int idCentroMedico) {
        this.idCentroMedico = idCentroMedico;
    }

    public Date getHoraInicial() {
        return horaInicial;
    }

    public void setHoraInicial(Date horaInicial) {
        this.horaInicial = horaInicial;
    }

    public Date getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(Date horaFinal) {
        this.horaFinal = horaFinal;
    }

    public int getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(int numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCita != null ? idCita.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cita)) {
            return false;
        }
        Cita other = (Cita) object;
        if ((this.idCita == null && other.idCita != null) || (this.idCita != null && !this.idCita.equals(other.idCita))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "relacionBase.Cita[ idCita=" + idCita + " ]";
    }
    
}
