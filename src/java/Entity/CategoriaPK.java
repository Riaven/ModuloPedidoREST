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
public class CategoriaPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "idCategoria")
    private int idCategoria;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Franquicia_idFranquicia")
    private int franquiciaidFranquicia;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Franquicia_Local_idLocal")
    private int franquiciaLocalidLocal;

    public CategoriaPK() {
    }

    public CategoriaPK(int idCategoria, int franquiciaidFranquicia, int franquiciaLocalidLocal) {
        this.idCategoria = idCategoria;
        this.franquiciaidFranquicia = franquiciaidFranquicia;
        this.franquiciaLocalidLocal = franquiciaLocalidLocal;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public int getFranquiciaidFranquicia() {
        return franquiciaidFranquicia;
    }

    public void setFranquiciaidFranquicia(int franquiciaidFranquicia) {
        this.franquiciaidFranquicia = franquiciaidFranquicia;
    }

    public int getFranquiciaLocalidLocal() {
        return franquiciaLocalidLocal;
    }

    public void setFranquiciaLocalidLocal(int franquiciaLocalidLocal) {
        this.franquiciaLocalidLocal = franquiciaLocalidLocal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idCategoria;
        hash += (int) franquiciaidFranquicia;
        hash += (int) franquiciaLocalidLocal;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CategoriaPK)) {
            return false;
        }
        CategoriaPK other = (CategoriaPK) object;
        if (this.idCategoria != other.idCategoria) {
            return false;
        }
        if (this.franquiciaidFranquicia != other.franquiciaidFranquicia) {
            return false;
        }
        if (this.franquiciaLocalidLocal != other.franquiciaLocalidLocal) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.CategoriaPK[ idCategoria=" + idCategoria + ", franquiciaidFranquicia=" + franquiciaidFranquicia + ", franquiciaLocalidLocal=" + franquiciaLocalidLocal + " ]";
    }
    
}
