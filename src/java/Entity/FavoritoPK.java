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
public class FavoritoPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "Usuario_idUsuario")
    private int usuarioidUsuario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Usuario_Localidad_idLocalidad")
    private int usuarioLocalidadidLocalidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Local_idLocal")
    private int localidLocal;

    public FavoritoPK() {
    }

    public FavoritoPK(int usuarioidUsuario, int usuarioLocalidadidLocalidad, int localidLocal) {
        this.usuarioidUsuario = usuarioidUsuario;
        this.usuarioLocalidadidLocalidad = usuarioLocalidadidLocalidad;
        this.localidLocal = localidLocal;
    }

    public int getUsuarioidUsuario() {
        return usuarioidUsuario;
    }

    public void setUsuarioidUsuario(int usuarioidUsuario) {
        this.usuarioidUsuario = usuarioidUsuario;
    }

    public int getUsuarioLocalidadidLocalidad() {
        return usuarioLocalidadidLocalidad;
    }

    public void setUsuarioLocalidadidLocalidad(int usuarioLocalidadidLocalidad) {
        this.usuarioLocalidadidLocalidad = usuarioLocalidadidLocalidad;
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
        hash += (int) usuarioidUsuario;
        hash += (int) usuarioLocalidadidLocalidad;
        hash += (int) localidLocal;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FavoritoPK)) {
            return false;
        }
        FavoritoPK other = (FavoritoPK) object;
        if (this.usuarioidUsuario != other.usuarioidUsuario) {
            return false;
        }
        if (this.usuarioLocalidadidLocalidad != other.usuarioLocalidadidLocalidad) {
            return false;
        }
        if (this.localidLocal != other.localidLocal) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.FavoritoPK[ usuarioidUsuario=" + usuarioidUsuario + ", usuarioLocalidadidLocalidad=" + usuarioLocalidadidLocalidad + ", localidLocal=" + localidLocal + " ]";
    }
    
}
