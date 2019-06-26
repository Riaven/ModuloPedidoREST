/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

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
 * @author Riaven
 */
@Entity
@Table(name = "repartidor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Repartidor.findAll", query = "SELECT r FROM Repartidor r")
    , @NamedQuery(name = "Repartidor.findByIdRepartidor", query = "SELECT r FROM Repartidor r WHERE r.idRepartidor = :idRepartidor")
    , @NamedQuery(name = "Repartidor.findByRut", query = "SELECT r FROM Repartidor r WHERE r.rut = :rut")
    , @NamedQuery(name = "Repartidor.findByNombre", query = "SELECT r FROM Repartidor r WHERE r.nombre = :nombre")
    , @NamedQuery(name = "Repartidor.findByApellido", query = "SELECT r FROM Repartidor r WHERE r.apellido = :apellido")
    , @NamedQuery(name = "Repartidor.findByCelular", query = "SELECT r FROM Repartidor r WHERE r.celular = :celular")
    , @NamedQuery(name = "Repartidor.findByDomicilio", query = "SELECT r FROM Repartidor r WHERE r.domicilio = :domicilio")
    , @NamedQuery(name = "Repartidor.findByEmail", query = "SELECT r FROM Repartidor r WHERE r.email = :email")})
public class Repartidor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idRepartidor")
    private Integer idRepartidor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "rut")
    private String rut;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "apellido")
    private String apellido;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "celular")
    private String celular;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "domicilio")
    private String domicilio;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "email")
    private String email;

    public Repartidor() {
    }

    public Repartidor(Integer idRepartidor) {
        this.idRepartidor = idRepartidor;
    }

    public Repartidor(Integer idRepartidor, String rut, String nombre, String apellido, String celular, String domicilio, String email) {
        this.idRepartidor = idRepartidor;
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.domicilio = domicilio;
        this.email = email;
    }

    public Integer getIdRepartidor() {
        return idRepartidor;
    }

    public void setIdRepartidor(Integer idRepartidor) {
        this.idRepartidor = idRepartidor;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRepartidor != null ? idRepartidor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Repartidor)) {
            return false;
        }
        Repartidor other = (Repartidor) object;
        if ((this.idRepartidor == null && other.idRepartidor != null) || (this.idRepartidor != null && !this.idRepartidor.equals(other.idRepartidor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Repartidor[ idRepartidor=" + idRepartidor + " ]";
    }
    
}
