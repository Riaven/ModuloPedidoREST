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
@Table(name = "tipo_tarjeta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoTarjeta.findAll", query = "SELECT t FROM TipoTarjeta t")
    , @NamedQuery(name = "TipoTarjeta.findByIdTipotarjeta", query = "SELECT t FROM TipoTarjeta t WHERE t.idTipotarjeta = :idTipotarjeta")
    , @NamedQuery(name = "TipoTarjeta.findByNombre", query = "SELECT t FROM TipoTarjeta t WHERE t.nombre = :nombre")})
public class TipoTarjeta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idTipo_tarjeta")
    private Integer idTipotarjeta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre")
    private String nombre;

    public TipoTarjeta() {
    }

    public TipoTarjeta(Integer idTipotarjeta) {
        this.idTipotarjeta = idTipotarjeta;
    }

    public TipoTarjeta(Integer idTipotarjeta, String nombre) {
        this.idTipotarjeta = idTipotarjeta;
        this.nombre = nombre;
    }

    public Integer getIdTipotarjeta() {
        return idTipotarjeta;
    }

    public void setIdTipotarjeta(Integer idTipotarjeta) {
        this.idTipotarjeta = idTipotarjeta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipotarjeta != null ? idTipotarjeta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoTarjeta)) {
            return false;
        }
        TipoTarjeta other = (TipoTarjeta) object;
        if ((this.idTipotarjeta == null && other.idTipotarjeta != null) || (this.idTipotarjeta != null && !this.idTipotarjeta.equals(other.idTipotarjeta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.TipoTarjeta[ idTipotarjeta=" + idTipotarjeta + " ]";
    }
    
}
