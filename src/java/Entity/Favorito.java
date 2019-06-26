/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Riaven
 */
@Entity
@Table(name = "favorito")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Favorito.findAll", query = "SELECT f FROM Favorito f")
    , @NamedQuery(name = "Favorito.findByUsuarioidUsuario", query = "SELECT f FROM Favorito f WHERE f.favoritoPK.usuarioidUsuario = :usuarioidUsuario")
    , @NamedQuery(name = "Favorito.findByUsuarioLocalidadidLocalidad", query = "SELECT f FROM Favorito f WHERE f.favoritoPK.usuarioLocalidadidLocalidad = :usuarioLocalidadidLocalidad")
    , @NamedQuery(name = "Favorito.findByLocalidLocal", query = "SELECT f FROM Favorito f WHERE f.favoritoPK.localidLocal = :localidLocal")})
public class Favorito implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FavoritoPK favoritoPK;

    public Favorito() {
    }

    public Favorito(FavoritoPK favoritoPK) {
        this.favoritoPK = favoritoPK;
    }

    public Favorito(int usuarioidUsuario, int usuarioLocalidadidLocalidad, int localidLocal) {
        this.favoritoPK = new FavoritoPK(usuarioidUsuario, usuarioLocalidadidLocalidad, localidLocal);
    }

    public FavoritoPK getFavoritoPK() {
        return favoritoPK;
    }

    public void setFavoritoPK(FavoritoPK favoritoPK) {
        this.favoritoPK = favoritoPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (favoritoPK != null ? favoritoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Favorito)) {
            return false;
        }
        Favorito other = (Favorito) object;
        if ((this.favoritoPK == null && other.favoritoPK != null) || (this.favoritoPK != null && !this.favoritoPK.equals(other.favoritoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Favorito[ favoritoPK=" + favoritoPK + " ]";
    }
    
}
