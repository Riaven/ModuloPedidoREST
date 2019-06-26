/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity.service;

import Entity.Categoria;
import Entity.CategoriaPK;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.PathSegment;

/**
 *
 * @author Riaven
 */
@Stateless
@Path("entity.categoria")
public class CategoriaFacadeREST extends AbstractFacade<Categoria> {

    @PersistenceContext(unitName = "ModuloPedidoRESTPU")
    private EntityManager em;

    private CategoriaPK getPrimaryKey(PathSegment pathSegment) {
        /*
         * pathSemgent represents a URI path segment and any associated matrix parameters.
         * URI path part is supposed to be in form of 'somePath;idCategoria=idCategoriaValue;franquiciaidFranquicia=franquiciaidFranquiciaValue;franquiciaLocalidLocal=franquiciaLocalidLocalValue'.
         * Here 'somePath' is a result of getPath() method invocation and
         * it is ignored in the following code.
         * Matrix parameters are used as field names to build a primary key instance.
         */
        Entity.CategoriaPK key = new Entity.CategoriaPK();
        javax.ws.rs.core.MultivaluedMap<String, String> map = pathSegment.getMatrixParameters();
        java.util.List<String> idCategoria = map.get("idCategoria");
        if (idCategoria != null && !idCategoria.isEmpty()) {
            key.setIdCategoria(new java.lang.Integer(idCategoria.get(0)));
        }
        java.util.List<String> franquiciaidFranquicia = map.get("franquiciaidFranquicia");
        if (franquiciaidFranquicia != null && !franquiciaidFranquicia.isEmpty()) {
            key.setFranquiciaidFranquicia(new java.lang.Integer(franquiciaidFranquicia.get(0)));
        }
        java.util.List<String> franquiciaLocalidLocal = map.get("franquiciaLocalidLocal");
        if (franquiciaLocalidLocal != null && !franquiciaLocalidLocal.isEmpty()) {
            key.setFranquiciaLocalidLocal(new java.lang.Integer(franquiciaLocalidLocal.get(0)));
        }
        return key;
    }

    public CategoriaFacadeREST() {
        super(Categoria.class);
    }

    @POST
    @Override
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(Categoria entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") PathSegment id, Categoria entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") PathSegment id) {
        Entity.CategoriaPK key = getPrimaryKey(id);
        super.remove(super.find(key));
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Categoria find(@PathParam("id") PathSegment id) {
        Entity.CategoriaPK key = getPrimaryKey(id);
        return super.find(key);
    }

    @GET
    @Override
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Categoria> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Categoria> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces(MediaType.TEXT_PLAIN)
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
