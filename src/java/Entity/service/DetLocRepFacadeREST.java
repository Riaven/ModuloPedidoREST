/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity.service;

import Entity.DetLocRep;
import Entity.DetLocRepPK;
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
@Path("entity.detlocrep")
public class DetLocRepFacadeREST extends AbstractFacade<DetLocRep> {

    @PersistenceContext(unitName = "ModuloPedidoRESTPU")
    private EntityManager em;

    private DetLocRepPK getPrimaryKey(PathSegment pathSegment) {
        /*
         * pathSemgent represents a URI path segment and any associated matrix parameters.
         * URI path part is supposed to be in form of 'somePath;localidadidLocalidad=localidadidLocalidadValue;repartidoridRepartidor=repartidoridRepartidorValue'.
         * Here 'somePath' is a result of getPath() method invocation and
         * it is ignored in the following code.
         * Matrix parameters are used as field names to build a primary key instance.
         */
        Entity.DetLocRepPK key = new Entity.DetLocRepPK();
        javax.ws.rs.core.MultivaluedMap<String, String> map = pathSegment.getMatrixParameters();
        java.util.List<String> localidadidLocalidad = map.get("localidadidLocalidad");
        if (localidadidLocalidad != null && !localidadidLocalidad.isEmpty()) {
            key.setLocalidadidLocalidad(new java.lang.Integer(localidadidLocalidad.get(0)));
        }
        java.util.List<String> repartidoridRepartidor = map.get("repartidoridRepartidor");
        if (repartidoridRepartidor != null && !repartidoridRepartidor.isEmpty()) {
            key.setRepartidoridRepartidor(new java.lang.Integer(repartidoridRepartidor.get(0)));
        }
        return key;
    }

    public DetLocRepFacadeREST() {
        super(DetLocRep.class);
    }

    @POST
    @Override
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(DetLocRep entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") PathSegment id, DetLocRep entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") PathSegment id) {
        Entity.DetLocRepPK key = getPrimaryKey(id);
        super.remove(super.find(key));
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public DetLocRep find(@PathParam("id") PathSegment id) {
        Entity.DetLocRepPK key = getPrimaryKey(id);
        return super.find(key);
    }

    @GET
    @Override
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<DetLocRep> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<DetLocRep> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
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
