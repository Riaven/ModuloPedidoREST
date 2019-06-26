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
public class StockProdPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "Carta_idCarta")
    private int cartaidCarta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Carta_Franquicia_idFranquicia")
    private int cartaFranquiciaidFranquicia;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Carta_Franquicia_Local_idLocal")
    private int cartaFranquiciaLocalidLocal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Producto_idProducto")
    private int productoidProducto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Producto_Local_idLocal")
    private int productoLocalidLocal;

    public StockProdPK() {
    }

    public StockProdPK(int cartaidCarta, int cartaFranquiciaidFranquicia, int cartaFranquiciaLocalidLocal, int productoidProducto, int productoLocalidLocal) {
        this.cartaidCarta = cartaidCarta;
        this.cartaFranquiciaidFranquicia = cartaFranquiciaidFranquicia;
        this.cartaFranquiciaLocalidLocal = cartaFranquiciaLocalidLocal;
        this.productoidProducto = productoidProducto;
        this.productoLocalidLocal = productoLocalidLocal;
    }

    public int getCartaidCarta() {
        return cartaidCarta;
    }

    public void setCartaidCarta(int cartaidCarta) {
        this.cartaidCarta = cartaidCarta;
    }

    public int getCartaFranquiciaidFranquicia() {
        return cartaFranquiciaidFranquicia;
    }

    public void setCartaFranquiciaidFranquicia(int cartaFranquiciaidFranquicia) {
        this.cartaFranquiciaidFranquicia = cartaFranquiciaidFranquicia;
    }

    public int getCartaFranquiciaLocalidLocal() {
        return cartaFranquiciaLocalidLocal;
    }

    public void setCartaFranquiciaLocalidLocal(int cartaFranquiciaLocalidLocal) {
        this.cartaFranquiciaLocalidLocal = cartaFranquiciaLocalidLocal;
    }

    public int getProductoidProducto() {
        return productoidProducto;
    }

    public void setProductoidProducto(int productoidProducto) {
        this.productoidProducto = productoidProducto;
    }

    public int getProductoLocalidLocal() {
        return productoLocalidLocal;
    }

    public void setProductoLocalidLocal(int productoLocalidLocal) {
        this.productoLocalidLocal = productoLocalidLocal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) cartaidCarta;
        hash += (int) cartaFranquiciaidFranquicia;
        hash += (int) cartaFranquiciaLocalidLocal;
        hash += (int) productoidProducto;
        hash += (int) productoLocalidLocal;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StockProdPK)) {
            return false;
        }
        StockProdPK other = (StockProdPK) object;
        if (this.cartaidCarta != other.cartaidCarta) {
            return false;
        }
        if (this.cartaFranquiciaidFranquicia != other.cartaFranquiciaidFranquicia) {
            return false;
        }
        if (this.cartaFranquiciaLocalidLocal != other.cartaFranquiciaLocalidLocal) {
            return false;
        }
        if (this.productoidProducto != other.productoidProducto) {
            return false;
        }
        if (this.productoLocalidLocal != other.productoLocalidLocal) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.StockProdPK[ cartaidCarta=" + cartaidCarta + ", cartaFranquiciaidFranquicia=" + cartaFranquiciaidFranquicia + ", cartaFranquiciaLocalidLocal=" + cartaFranquiciaLocalidLocal + ", productoidProducto=" + productoidProducto + ", productoLocalidLocal=" + productoLocalidLocal + " ]";
    }
    
}
