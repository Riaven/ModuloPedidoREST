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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Riaven
 */
@Entity
@Table(name = "categoria")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Categoria.findAll", query = "SELECT c FROM Categoria c")
    , @NamedQuery(name = "Categoria.findByIdCategoria", query = "SELECT c FROM Categoria c WHERE c.categoriaPK.idCategoria = :idCategoria")
    , @NamedQuery(name = "Categoria.findByNombreCat", query = "SELECT c FROM Categoria c WHERE c.nombreCat = :nombreCat")
    , @NamedQuery(name = "Categoria.findByIdFranquicia", query = "SELECT c FROM Categoria c WHERE c.idFranquicia = :idFranquicia")
    , @NamedQuery(name = "Categoria.findByFranquiciaidFranquicia", query = "SELECT c FROM Categoria c WHERE c.categoriaPK.franquiciaidFranquicia = :franquiciaidFranquicia")
    , @NamedQuery(name = "Categoria.findByFranquiciaLocalidLocal", query = "SELECT c FROM Categoria c WHERE c.categoriaPK.franquiciaLocalidLocal = :franquiciaLocalidLocal")})
public class Categoria implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CategoriaPK categoriaPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre_cat")
    private String nombreCat;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idFranquicia")
    private int idFranquicia;

    public Categoria() {
    }

    public Categoria(CategoriaPK categoriaPK) {
        this.categoriaPK = categoriaPK;
    }

    public Categoria(CategoriaPK categoriaPK, String nombreCat, int idFranquicia) {
        this.categoriaPK = categoriaPK;
        this.nombreCat = nombreCat;
        this.idFranquicia = idFranquicia;
    }

    public Categoria(int idCategoria, int franquiciaidFranquicia, int franquiciaLocalidLocal) {
        this.categoriaPK = new CategoriaPK(idCategoria, franquiciaidFranquicia, franquiciaLocalidLocal);
    }

    public CategoriaPK getCategoriaPK() {
        return categoriaPK;
    }

    public void setCategoriaPK(CategoriaPK categoriaPK) {
        this.categoriaPK = categoriaPK;
    }

    public String getNombreCat() {
        return nombreCat;
    }

    public void setNombreCat(String nombreCat) {
        this.nombreCat = nombreCat;
    }

    public int getIdFranquicia() {
        return idFranquicia;
    }

    public void setIdFranquicia(int idFranquicia) {
        this.idFranquicia = idFranquicia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (categoriaPK != null ? categoriaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Categoria)) {
            return false;
        }
        Categoria other = (Categoria) object;
        if ((this.categoriaPK == null && other.categoriaPK != null) || (this.categoriaPK != null && !this.categoriaPK.equals(other.categoriaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Categoria[ categoriaPK=" + categoriaPK + " ]";
    }
    
}
