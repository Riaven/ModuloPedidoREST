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
public class ProductoPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "idProducto")
    private int idProducto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Local_idLocal")
    private int localidLocal;

    public ProductoPK() {
    }

    public ProductoPK(int idProducto, int localidLocal) {
        this.idProducto = idProducto;
        this.localidLocal = localidLocal;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getLocalidLocal() {
        return localidLocal;
    }

    public void setLocalidLocal(int localidLocal) {
        this.localidLocal = localidLocal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idProducto;
        hash += (int) localidLocal;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductoPK)) {
            return false;
        }
        ProductoPK other = (ProductoPK) object;
        if (this.idProducto != other.idProducto) {
            return false;
        }
        if (this.localidLocal != other.localidLocal) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.ProductoPK[ idProducto=" + idProducto + ", localidLocal=" + localidLocal + " ]";
    }
    
}
