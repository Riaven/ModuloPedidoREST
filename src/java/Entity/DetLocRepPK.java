/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Riaven
 */
@Embeddable
public class DetLocRepPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "Localidad_idLocalidad")
    private int localidadidLocalidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Repartidor_idRepartidor")
    private int repartidoridRepartidor;

    public DetLocRepPK() {
    }

    public DetLocRepPK(int localidadidLocalidad, int repartidoridRepartidor) {
        this.localidadidLocalidad = localidadidLocalidad;
        this.repartidoridRepartidor = repartidoridRepartidor;
    }

    public int getLocalidadidLocalidad() {
        return localidadidLocalidad;
    }

    public void setLocalidadidLocalidad(int localidadidLocalidad) {
        this.localidadidLocalidad = localidadidLocalidad;
    }

    public int getRepartidoridRepartidor() {
        return repartidoridRepartidor;
    }

    public void setRepartidoridRepartidor(int repartidoridRepartidor) {
        this.repartidoridRepartidor = repartidoridRepartidor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) localidadidLocalidad;
        hash += (int) repartidoridRepartidor;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetLocRepPK)) {
            return false;
        }
        DetLocRepPK other = (DetLocRepPK) object;
        if (this.localidadidLocalidad != other.localidadidLocalidad) {
            return false;
        }
        if (this.repartidoridRepartidor != other.repartidoridRepartidor) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.DetLocRepPK[ localidadidLocalidad=" + localidadidLocalidad + ", repartidoridRepartidor=" + repartidoridRepartidor + " ]";
    }
    
}
