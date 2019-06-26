/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Riaven
 */
@Entity
@Table(name = "tarjeta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tarjeta.findAll", query = "SELECT t FROM Tarjeta t")
    , @NamedQuery(name = "Tarjeta.findByStripcToken", query = "SELECT t FROM Tarjeta t WHERE t.stripcToken = :stripcToken")
    , @NamedQuery(name = "Tarjeta.findByDigitos", query = "SELECT t FROM Tarjeta t WHERE t.digitos = :digitos")
    , @NamedQuery(name = "Tarjeta.findByUsuarioidUsuario", query = "SELECT t FROM Tarjeta t WHERE t.tarjetaPK.usuarioidUsuario = :usuarioidUsuario")
    , @NamedQuery(name = "Tarjeta.findByUsuarioLocalidadidLocalidad", query = "SELECT t FROM Tarjeta t WHERE t.tarjetaPK.usuarioLocalidadidLocalidad = :usuarioLocalidadidLocalidad")
    , @NamedQuery(name = "Tarjeta.findByTipotarjetaidTipotarjeta", query = "SELECT t FROM Tarjeta t WHERE t.tarjetaPK.tipotarjetaidTipotarjeta = :tipotarjetaidTipotarjeta")})
public class Tarjeta implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TarjetaPK tarjetaPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "stripc_token")
    private int stripcToken;
    @Basic(optional = false)
    @NotNull
    @Column(name = "digitos")
    private int digitos;

    public Tarjeta() {
    }

    public Tarjeta(TarjetaPK tarjetaPK) {
        this.tarjetaPK = tarjetaPK;
    }

    public Tarjeta(TarjetaPK tarjetaPK, int stripcToken, int digitos) {
        this.tarjetaPK = tarjetaPK;
        this.stripcToken = stripcToken;
        this.digitos = digitos;
    }

    public Tarjeta(int usuarioidUsuario, int usuarioLocalidadidLocalidad, int tipotarjetaidTipotarjeta) {
        this.tarjetaPK = new TarjetaPK(usuarioidUsuario, usuarioLocalidadidLocalidad, tipotarjetaidTipotarjeta);
    }

    public TarjetaPK getTarjetaPK() {
        return tarjetaPK;
    }

    public void setTarjetaPK(TarjetaPK tarjetaPK) {
        this.tarjetaPK = tarjetaPK;
    }

    public int getStripcToken() {
        return stripcToken;
    }

    public void setStripcToken(int stripcToken) {
        this.stripcToken = stripcToken;
    }

    public int getDigitos() {
        return digitos;
    }

    public void setDigitos(int digitos) {
        this.digitos = digitos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tarjetaPK != null ? tarjetaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tarjeta)) {
            return false;
        }
        Tarjeta other = (Tarjeta) object;
        if ((this.tarjetaPK == null && other.tarjetaPK != null) || (this.tarjetaPK != null && !this.tarjetaPK.equals(other.tarjetaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Tarjeta[ tarjetaPK=" + tarjetaPK + " ]";
    }
    
}
