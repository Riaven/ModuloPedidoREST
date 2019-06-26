/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Riaven
 */
@Entity
@Table(name = "det_loc_rep")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DetLocRep.findAll", query = "SELECT d FROM DetLocRep d")
    , @NamedQuery(name = "DetLocRep.findByHora", query = "SELECT d FROM DetLocRep d WHERE d.hora = :hora")
    , @NamedQuery(name = "DetLocRep.findByFecha", query = "SELECT d FROM DetLocRep d WHERE d.fecha = :fecha")
    , @NamedQuery(name = "DetLocRep.findByLocalidadidLocalidad", query = "SELECT d FROM DetLocRep d WHERE d.detLocRepPK.localidadidLocalidad = :localidadidLocalidad")
    , @NamedQuery(name = "DetLocRep.findByRepartidoridRepartidor", query = "SELECT d FROM DetLocRep d WHERE d.detLocRepPK.repartidoridRepartidor = :repartidoridRepartidor")})
public class DetLocRep implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetLocRepPK detLocRepPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "hora")
    @Temporal(TemporalType.TIME)
    private Date hora;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;

    public DetLocRep() {
    }

    public DetLocRep(DetLocRepPK detLocRepPK) {
        this.detLocRepPK = detLocRepPK;
    }

    public DetLocRep(DetLocRepPK detLocRepPK, Date hora, Date fecha) {
        this.detLocRepPK = detLocRepPK;
        this.hora = hora;
        this.fecha = fecha;
    }

    public DetLocRep(int localidadidLocalidad, int repartidoridRepartidor) {
        this.detLocRepPK = new DetLocRepPK(localidadidLocalidad, repartidoridRepartidor);
    }

    public DetLocRepPK getDetLocRepPK() {
        return detLocRepPK;
    }

    public void setDetLocRepPK(DetLocRepPK detLocRepPK) {
        this.detLocRepPK = detLocRepPK;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detLocRepPK != null ? detLocRepPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetLocRep)) {
            return false;
        }
        DetLocRep other = (DetLocRep) object;
        if ((this.detLocRepPK == null && other.detLocRepPK != null) || (this.detLocRepPK != null && !this.detLocRepPK.equals(other.detLocRepPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.DetLocRep[ detLocRepPK=" + detLocRepPK + " ]";
    }
    
}
