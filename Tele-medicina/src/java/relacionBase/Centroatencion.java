/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionBase;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author carlos andres
 */
@Entity
@Table(name = "centroatencion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Centroatencion.findAll", query = "SELECT c FROM Centroatencion c"),
    @NamedQuery(name = "Centroatencion.findByIdCentroMedico", query = "SELECT c FROM Centroatencion c WHERE c.idCentroMedico = :idCentroMedico"),
    @NamedQuery(name = "Centroatencion.findByNombre", query = "SELECT c FROM Centroatencion c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "Centroatencion.findByNit", query = "SELECT c FROM Centroatencion c WHERE c.nit = :nit"),
    @NamedQuery(name = "Centroatencion.findByUbicacion", query = "SELECT c FROM Centroatencion c WHERE c.ubicacion = :ubicacion"),
    @NamedQuery(name = "Centroatencion.findByNivel", query = "SELECT c FROM Centroatencion c WHERE c.nivel = :nivel")})
public class Centroatencion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idCentroMedico")
    private Integer idCentroMedico;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "nit")
    private int nit;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "ubicacion")
    private String ubicacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "nivel")
    private int nivel;

    public Centroatencion() {
    }

    public Centroatencion(Integer idCentroMedico) {
        this.idCentroMedico = idCentroMedico;
    }

    public Centroatencion(Integer idCentroMedico, String nombre, int nit, String ubicacion, int nivel) {
        this.idCentroMedico = idCentroMedico;
        this.nombre = nombre;
        this.nit = nit;
        this.ubicacion = ubicacion;
        this.nivel = nivel;
    }

    public Integer getIdCentroMedico() {
        return idCentroMedico;
    }

    public void setIdCentroMedico(Integer idCentroMedico) {
        this.idCentroMedico = idCentroMedico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCentroMedico != null ? idCentroMedico.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Centroatencion)) {
            return false;
        }
        Centroatencion other = (Centroatencion) object;
        if ((this.idCentroMedico == null && other.idCentroMedico != null) || (this.idCentroMedico != null && !this.idCentroMedico.equals(other.idCentroMedico))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "relacionBase.Centroatencion[ idCentroMedico=" + idCentroMedico + " ]";
    }
    
}
