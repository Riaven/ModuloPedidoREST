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
@Table(name = "comentario_rep")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ComentarioRep.findAll", query = "SELECT c FROM ComentarioRep c")
    , @NamedQuery(name = "ComentarioRep.findByIdComentariorep", query = "SELECT c FROM ComentarioRep c WHERE c.idComentariorep = :idComentariorep")
    , @NamedQuery(name = "ComentarioRep.findByComentario", query = "SELECT c FROM ComentarioRep c WHERE c.comentario = :comentario")
    , @NamedQuery(name = "ComentarioRep.findByNota", query = "SELECT c FROM ComentarioRep c WHERE c.nota = :nota")
    , @NamedQuery(name = "ComentarioRep.findByRepartidoridRepartidor", query = "SELECT c FROM ComentarioRep c WHERE c.repartidoridRepartidor = :repartidoridRepartidor")})
public class ComentarioRep implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idComentario_rep")
    private Integer idComentariorep;
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
    @Column(name = "Repartidor_idRepartidor")
    private int repartidoridRepartidor;

    public ComentarioRep() {
    }

    public ComentarioRep(Integer idComentariorep) {
        this.idComentariorep = idComentariorep;
    }

    public ComentarioRep(Integer idComentariorep, String comentario, double nota, int repartidoridRepartidor) {
        this.idComentariorep = idComentariorep;
        this.comentario = comentario;
        this.nota = nota;
        this.repartidoridRepartidor = repartidoridRepartidor;
    }

    public Integer getIdComentariorep() {
        return idComentariorep;
    }

    public void setIdComentariorep(Integer idComentariorep) {
        this.idComentariorep = idComentariorep;
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

    public int getRepartidoridRepartidor() {
        return repartidoridRepartidor;
    }

    public void setRepartidoridRepartidor(int repartidoridRepartidor) {
        this.repartidoridRepartidor = repartidoridRepartidor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idComentariorep != null ? idComentariorep.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ComentarioRep)) {
            return false;
        }
        ComentarioRep other = (ComentarioRep) object;
        if ((this.idComentariorep == null && other.idComentariorep != null) || (this.idComentariorep != null && !this.idComentariorep.equals(other.idComentariorep))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.ComentarioRep[ idComentariorep=" + idComentariorep + " ]";
    }
    
}
