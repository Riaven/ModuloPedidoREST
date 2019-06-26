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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Riaven
 */
@Entity
@Table(name = "promo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Promo.findAll", query = "SELECT p FROM Promo p")
    , @NamedQuery(name = "Promo.findByIdPromo", query = "SELECT p FROM Promo p WHERE p.idPromo = :idPromo")
    , @NamedQuery(name = "Promo.findByPrecio", query = "SELECT p FROM Promo p WHERE p.precio = :precio")
    , @NamedQuery(name = "Promo.findByIdProducto", query = "SELECT p FROM Promo p WHERE p.idProducto = :idProducto")
    , @NamedQuery(name = "Promo.findByProductoidProducto", query = "SELECT p FROM Promo p WHERE p.productoidProducto = :productoidProducto")})
public class Promo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idPromo")
    private Integer idPromo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "precio")
    private int precio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idProducto")
    private int idProducto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Producto_idProducto")
    private int productoidProducto;

    public Promo() {
    }

    public Promo(Integer idPromo) {
        this.idPromo = idPromo;
    }

    public Promo(Integer idPromo, int precio, int idProducto, int productoidProducto) {
        this.idPromo = idPromo;
        this.precio = precio;
        this.idProducto = idProducto;
        this.productoidProducto = productoidProducto;
    }

    public Integer getIdPromo() {
        return idPromo;
    }

    public void setIdPromo(Integer idPromo) {
        this.idPromo = idPromo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getProductoidProducto() {
        return productoidProducto;
    }

    public void setProductoidProducto(int productoidProducto) {
        this.productoidProducto = productoidProducto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPromo != null ? idPromo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Promo)) {
            return false;
        }
        Promo other = (Promo) object;
        if ((this.idPromo == null && other.idPromo != null) || (this.idPromo != null && !this.idPromo.equals(other.idPromo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Promo[ idPromo=" + idPromo + " ]";
    }
    
}
