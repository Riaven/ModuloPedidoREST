/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity.service;

import Entity.Favorito;
import Entity.FavoritoPK;
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
@Path("entity.favorito")
public class FavoritoFacadeREST extends AbstractFacade<Favorito> {

    @PersistenceContext(unitName = "ModuloPedidoRESTPU")
    private EntityManager em;

    private FavoritoPK getPrimaryKey(PathSegment pathSegment) {
        /*
         * pathSemgent represents a URI path segment and any associated matrix parameters.
         * URI path part is supposed to be in form of 'somePath;usuarioidUsuario=usuarioidUsuarioValue;usuarioLocalidadidLocalidad=usuarioLocalidadidLocalidadValue;localidLocal=localidLocalValue'.
         * Here 'somePath' is a result of getPath() method invocation and
         * it is ignored in the following code.
         * Matrix parameters are used as field names to build a primary key instance.
         */
        Entity.FavoritoPK key = new Entity.FavoritoPK();
        javax.ws.rs.core.MultivaluedMap<String, String> map = pathSegment.getMatrixParameters();
        java.util.List<String> usuarioidUsuario = map.get("usuarioidUsuario");
        if (usuarioidUsuario != null && !usuarioidUsuario.isEmpty()) {
            key.setUsuarioidUsuario(new java.lang.Integer(usuarioidUsuario.get(0)));
        }
        java.util.List<String> usuarioLocalidadidLocalidad = map.get("usuarioLocalidadidLocalidad");
        if (usuarioLocalidadidLocalidad != null && !usuarioLocalidadidLocalidad.isEmpty()) {
            key.setUsuarioLocalidadidLocalidad(new java.lang.Integer(usuarioLocalidadidLocalidad.get(0)));
        }
        java.util.List<String> localidLocal = map.get("localidLocal");
        if (localidLocal != null && !localidLocal.isEmpty()) {
            key.setLocalidLocal(new java.lang.Integer(localidLocal.get(0)));
        }
        return key;
    }

    public FavoritoFacadeREST() {
        super(Favorito.class);
    }

    @POST
    @Override
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(Favorito entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") PathSegment id, Favorito entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") PathSegment id) {
        Entity.FavoritoPK key = getPrimaryKey(id);
        super.remove(super.find(key));
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Favorito find(@PathParam("id") PathSegment id) {
        Entity.FavoritoPK key = getPrimaryKey(id);
        return super.find(key);
    }

    @GET
    @Override
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Favorito> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Favorito> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
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
