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
@Table(name = "historiaclinica")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Historiaclinica.findAll", query = "SELECT h FROM Historiaclinica h"),
    @NamedQuery(name = "Historiaclinica.findById", query = "SELECT h FROM Historiaclinica h WHERE h.id = :id"),
    @NamedQuery(name = "Historiaclinica.findByIdPaciente", query = "SELECT h FROM Historiaclinica h WHERE h.idPaciente = :idPaciente"),
    @NamedQuery(name = "Historiaclinica.findByAlergias", query = "SELECT h FROM Historiaclinica h WHERE h.alergias = :alergias"),
    @NamedQuery(name = "Historiaclinica.findByAntecedentePatologicos", query = "SELECT h FROM Historiaclinica h WHERE h.antecedentePatologicos = :antecedentePatologicos"),
    @NamedQuery(name = "Historiaclinica.findByAntecedenteFamiliar", query = "SELECT h FROM Historiaclinica h WHERE h.antecedenteFamiliar = :antecedenteFamiliar"),
    @NamedQuery(name = "Historiaclinica.findByCirujias", query = "SELECT h FROM Historiaclinica h WHERE h.cirujias = :cirujias")})
public class Historiaclinica implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idPaciente")
    private int idPaciente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "alergias")
    private String alergias;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "antecedentePatologicos")
    private String antecedentePatologicos;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "antecedenteFamiliar")
    private String antecedenteFamiliar;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "cirujias")
    private String cirujias;

    public Historiaclinica() {
    }

    public Historiaclinica(Integer id) {
        this.id = id;
    }

    public Historiaclinica(Integer id, int idPaciente, String alergias, String antecedentePatologicos, String antecedenteFamiliar, String cirujias) {
        this.id = id;
        this.idPaciente = idPaciente;
        this.alergias = alergias;
        this.antecedentePatologicos = antecedentePatologicos;
        this.antecedenteFamiliar = antecedenteFamiliar;
        this.cirujias = cirujias;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getAntecedentePatologicos() {
        return antecedentePatologicos;
    }

    public void setAntecedentePatologicos(String antecedentePatologicos) {
        this.antecedentePatologicos = antecedentePatologicos;
    }

    public String getAntecedenteFamiliar() {
        return antecedenteFamiliar;
    }

    public void setAntecedenteFamiliar(String antecedenteFamiliar) {
        this.antecedenteFamiliar = antecedenteFamiliar;
    }

    public String getCirujias() {
        return cirujias;
    }

    public void setCirujias(String cirujias) {
        this.cirujias = cirujias;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Historiaclinica)) {
            return false;
        }
        Historiaclinica other = (Historiaclinica) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "relacionBase.Historiaclinica[ id=" + id + " ]";
    }
    
}
