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
@Table(name = "pacientes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pacientes.findAll", query = "SELECT p FROM Pacientes p"),
    @NamedQuery(name = "Pacientes.findByUsuario", query = "SELECT p FROM Pacientes p WHERE p.usuario = :usuario"),
    @NamedQuery(name = "Pacientes.findByClave", query = "SELECT p FROM Pacientes p WHERE p.clave = :clave"),
    @NamedQuery(name = "Pacientes.findByRepitaClave", query = "SELECT p FROM Pacientes p WHERE p.repitaClave = :repitaClave"),
    @NamedQuery(name = "Pacientes.findByNombres", query = "SELECT p FROM Pacientes p WHERE p.nombres = :nombres"),
    @NamedQuery(name = "Pacientes.findByApellidos", query = "SELECT p FROM Pacientes p WHERE p.apellidos = :apellidos"),
    @NamedQuery(name = "Pacientes.findByTipoDocumento", query = "SELECT p FROM Pacientes p WHERE p.tipoDocumento = :tipoDocumento"),
    @NamedQuery(name = "Pacientes.findByNumeroDocumento", query = "SELECT p FROM Pacientes p WHERE p.numeroDocumento = :numeroDocumento"),
    @NamedQuery(name = "Pacientes.findByFechaNacimiento", query = "SELECT p FROM Pacientes p WHERE p.fechaNacimiento = :fechaNacimiento"),
    @NamedQuery(name = "Pacientes.findByTelefono", query = "SELECT p FROM Pacientes p WHERE p.telefono = :telefono"),
    @NamedQuery(name = "Pacientes.findByCelular", query = "SELECT p FROM Pacientes p WHERE p.celular = :celular"),
    @NamedQuery(name = "Pacientes.findByDirrecion", query = "SELECT p FROM Pacientes p WHERE p.dirrecion = :dirrecion"),
    @NamedQuery(name = "Pacientes.findByBarrio", query = "SELECT p FROM Pacientes p WHERE p.barrio = :barrio"),
    @NamedQuery(name = "Pacientes.findByEmail", query = "SELECT p FROM Pacientes p WHERE p.email = :email"),
    @NamedQuery(name = "Pacientes.findByEdad", query = "SELECT p FROM Pacientes p WHERE p.edad = :edad"),
    @NamedQuery(name = "Pacientes.findByEstatura", query = "SELECT p FROM Pacientes p WHERE p.estatura = :estatura"),
    @NamedQuery(name = "Pacientes.findByPeso", query = "SELECT p FROM Pacientes p WHERE p.peso = :peso"),
    @NamedQuery(name = "Pacientes.findByGenero", query = "SELECT p FROM Pacientes p WHERE p.genero = :genero")})
public class Pacientes implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "usuario")
    private String usuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 18)
    @Column(name = "clave")
    private String clave;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 18)
    @Column(name = "repitaClave")
    private String repitaClave;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "nombres")
    private String nombres;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "apellidos")
    private String apellidos;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "tipoDocumento")
    private String tipoDocumento;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "numeroDocumento")
    private Integer numeroDocumento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechaNacimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "telefono")
    private int telefono;
    @Basic(optional = false)
    @NotNull
    @Column(name = "celular")
    private int celular;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "dirrecion")
    private String dirrecion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "barrio")
    private String barrio;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Column(name = "edad")
    private int edad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "estatura")
    private String estatura;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "peso")
    private String peso;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "genero")
    private String genero;

    public Pacientes() {
    }

    public Pacientes(Integer numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public Pacientes(Integer numeroDocumento, String usuario, String clave, String repitaClave, String nombres, String apellidos, String tipoDocumento, Date fechaNacimiento, int telefono, int celular, String dirrecion, String barrio, String email, int edad, String estatura, String peso, String genero) {
        this.numeroDocumento = numeroDocumento;
        this.usuario = usuario;
        this.clave = clave;
        this.repitaClave = repitaClave;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipoDocumento = tipoDocumento;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.celular = celular;
        this.dirrecion = dirrecion;
        this.barrio = barrio;
        this.email = email;
        this.edad = edad;
        this.estatura = estatura;
        this.peso = peso;
        this.genero = genero;
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

    public String getRepitaClave() {
        return repitaClave;
    }

    public void setRepitaClave(String repitaClave) {
        this.repitaClave = repitaClave;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public Integer getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(Integer numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getDirrecion() {
        return dirrecion;
    }

    public void setDirrecion(String dirrecion) {
        this.dirrecion = dirrecion;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEstatura() {
        return estatura;
    }

    public void setEstatura(String estatura) {
        this.estatura = estatura;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numeroDocumento != null ? numeroDocumento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pacientes)) {
            return false;
        }
        Pacientes other = (Pacientes) object;
        if ((this.numeroDocumento == null && other.numeroDocumento != null) || (this.numeroDocumento != null && !this.numeroDocumento.equals(other.numeroDocumento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "relacionBase.Pacientes[ numeroDocumento=" + numeroDocumento + " ]";
    }
    
}
