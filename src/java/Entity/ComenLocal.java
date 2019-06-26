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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Riaven
 */
@Entity
@Table(name = "comen_local")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ComenLocal.findAll", query = "SELECT c FROM ComenLocal c")
    , @NamedQuery(name = "ComenLocal.findByIdComenLocal", query = "SELECT c FROM ComenLocal c WHERE c.idComenLocal = :idComenLocal")
    , @NamedQuery(name = "ComenLocal.findByComentario", query = "SELECT c FROM ComenLocal c WHERE c.comentario = :comentario")
    , @NamedQuery(name = "ComenLocal.findByNota", query = "SELECT c FROM ComenLocal c WHERE c.nota = :nota")
    , @NamedQuery(name = "ComenLocal.findByLocalidLocal", query = "SELECT c FROM ComenLocal c WHERE c.localidLocal = :localidLocal")})
public class ComenLocal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idComen_Local")
    private Integer idComenLocal;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "comentario")
    private String comentario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "nota")
    private double nota;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Local_idLocal")
    private int localidLocal;

    public ComenLocal() {
    }

    public ComenLocal(Integer idComenLocal) {
        this.idComenLocal = idComenLocal;
    }

    public ComenLocal(Integer idComenLocal, String comentario, double nota, int localidLocal) {
        this.idComenLocal = idComenLocal;
        this.comentario = comentario;
        this.nota = nota;
        this.localidLocal = localidLocal;
    }

    public Integer getIdComenLocal() {
        return idComenLocal;
    }

    public void setIdComenLocal(Integer idComenLocal) {
        this.idComenLocal = idComenLocal;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
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
        hash += (idComenLocal != null ? idComenLocal.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ComenLocal)) {
            return false;
        }
        ComenLocal other = (ComenLocal) object;
        if ((this.idComenLocal == null && other.idComenLocal != null) || (this.idComenLocal != null && !this.idComenLocal.equals(other.idComenLocal))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.ComenLocal[ idComenLocal=" + idComenLocal + " ]";
    }
    
}
