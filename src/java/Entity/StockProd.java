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
@Table(name = "stock_prod")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "StockProd.findAll", query = "SELECT s FROM StockProd s")
    , @NamedQuery(name = "StockProd.findByStock", query = "SELECT s FROM StockProd s WHERE s.stock = :stock")
    , @NamedQuery(name = "StockProd.findByCartaidCarta", query = "SELECT s FROM StockProd s WHERE s.stockProdPK.cartaidCarta = :cartaidCarta")
    , @NamedQuery(name = "StockProd.findByCartaFranquiciaidFranquicia", query = "SELECT s FROM StockProd s WHERE s.stockProdPK.cartaFranquiciaidFranquicia = :cartaFranquiciaidFranquicia")
    , @NamedQuery(name = "StockProd.findByCartaFranquiciaLocalidLocal", query = "SELECT s FROM StockProd s WHERE s.stockProdPK.cartaFranquiciaLocalidLocal = :cartaFranquiciaLocalidLocal")
    , @NamedQuery(name = "StockProd.findByProductoidProducto", query = "SELECT s FROM StockProd s WHERE s.stockProdPK.productoidProducto = :productoidProducto")
    , @NamedQuery(name = "StockProd.findByProductoLocalidLocal", query = "SELECT s FROM StockProd s WHERE s.stockProdPK.productoLocalidLocal = :productoLocalidLocal")})
public class StockProd implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected StockProdPK stockProdPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "stock")
    private int stock;

    public StockProd() {
    }

    public StockProd(StockProdPK stockProdPK) {
        this.stockProdPK = stockProdPK;
    }

    public StockProd(StockProdPK stockProdPK, int stock) {
        this.stockProdPK = stockProdPK;
        this.stock = stock;
    }

    public StockProd(int cartaidCarta, int cartaFranquiciaidFranquicia, int cartaFranquiciaLocalidLocal, int productoidProducto, int productoLocalidLocal) {
        this.stockProdPK = new StockProdPK(cartaidCarta, cartaFranquiciaidFranquicia, cartaFranquiciaLocalidLocal, productoidProducto, productoLocalidLocal);
    }

    public StockProdPK getStockProdPK() {
        return stockProdPK;
    }

    public void setStockProdPK(StockProdPK stockProdPK) {
        this.stockProdPK = stockProdPK;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (stockProdPK != null ? stockProdPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StockProd)) {
            return false;
        }
        StockProd other = (StockProd) object;
        if ((this.stockProdPK == null && other.stockProdPK != null) || (this.stockProdPK != null && !this.stockProdPK.equals(other.stockProdPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.StockProd[ stockProdPK=" + stockProdPK + " ]";
    }
    
}
