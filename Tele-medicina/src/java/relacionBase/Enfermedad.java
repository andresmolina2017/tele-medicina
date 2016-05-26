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
@Table(name = "enfermedad")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Enfermedad.findAll", query = "SELECT e FROM Enfermedad e"),
    @NamedQuery(name = "Enfermedad.findById", query = "SELECT e FROM Enfermedad e WHERE e.id = :id"),
    @NamedQuery(name = "Enfermedad.findByNombre", query = "SELECT e FROM Enfermedad e WHERE e.nombre = :nombre"),
    @NamedQuery(name = "Enfermedad.findByTipoEspecialidad", query = "SELECT e FROM Enfermedad e WHERE e.tipoEspecialidad = :tipoEspecialidad"),
    @NamedQuery(name = "Enfermedad.findByTratamiento", query = "SELECT e FROM Enfermedad e WHERE e.tratamiento = :tratamiento"),
    @NamedQuery(name = "Enfermedad.findByMedicamentos", query = "SELECT e FROM Enfermedad e WHERE e.medicamentos = :medicamentos")})
public class Enfermedad implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "tipoEspecialidad")
    private String tipoEspecialidad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "tratamiento")
    private String tratamiento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "medicamentos")
    private String medicamentos;

    public Enfermedad() {
    }

    public Enfermedad(Integer id) {
        this.id = id;
    }

    public Enfermedad(Integer id, String nombre, String tipoEspecialidad, String tratamiento, String medicamentos) {
        this.id = id;
        this.nombre = nombre;
        this.tipoEspecialidad = tipoEspecialidad;
        this.tratamiento = tratamiento;
        this.medicamentos = medicamentos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoEspecialidad() {
        return tipoEspecialidad;
    }

    public void setTipoEspecialidad(String tipoEspecialidad) {
        this.tipoEspecialidad = tipoEspecialidad;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public String getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
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
        if (!(object instanceof Enfermedad)) {
            return false;
        }
        Enfermedad other = (Enfermedad) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "relacionBase.Enfermedad[ id=" + id + " ]";
    }
    
}
