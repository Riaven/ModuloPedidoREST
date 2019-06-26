/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity.service;

import Entity.StockProd;
import Entity.StockProdPK;
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
@Path("entity.stockprod")
public class StockProdFacadeREST extends AbstractFacade<StockProd> {

    @PersistenceContext(unitName = "ModuloPedidoRESTPU")
    private EntityManager em;

    private StockProdPK getPrimaryKey(PathSegment pathSegment) {
        /*
         * pathSemgent represents a URI path segment and any associated matrix parameters.
         * URI path part is supposed to be in form of 'somePath;cartaidCarta=cartaidCartaValue;cartaFranquiciaidFranquicia=cartaFranquiciaidFranquiciaValue;cartaFranquiciaLocalidLocal=cartaFranquiciaLocalidLocalValue;productoidProducto=productoidProductoValue;productoLocalidLocal=productoLocalidLocalValue'.
         * Here 'somePath' is a result of getPath() method invocation and
         * it is ignored in the following code.
         * Matrix parameters are used as field names to build a primary key instance.
         */
        Entity.StockProdPK key = new Entity.StockProdPK();
        javax.ws.rs.core.MultivaluedMap<String, String> map = pathSegment.getMatrixParameters();
        java.util.List<String> cartaidCarta = map.get("cartaidCarta");
        if (cartaidCarta != null && !cartaidCarta.isEmpty()) {
            key.setCartaidCarta(new java.lang.Integer(cartaidCarta.get(0)));
        }
        java.util.List<String> cartaFranquiciaidFranquicia = map.get("cartaFranquiciaidFranquicia");
        if (cartaFranquiciaidFranquicia != null && !cartaFranquiciaidFranquicia.isEmpty()) {
            key.setCartaFranquiciaidFranquicia(new java.lang.Integer(cartaFranquiciaidFranquicia.get(0)));
        }
        java.util.List<String> cartaFranquiciaLocalidLocal = map.get("cartaFranquiciaLocalidLocal");
        if (cartaFranquiciaLocalidLocal != null && !cartaFranquiciaLocalidLocal.isEmpty()) {
            key.setCartaFranquiciaLocalidLocal(new java.lang.Integer(cartaFranquiciaLocalidLocal.get(0)));
        }
        java.util.List<String> productoidProducto = map.get("productoidProducto");
        if (productoidProducto != null && !productoidProducto.isEmpty()) {
            key.setProductoidProducto(new java.lang.Integer(productoidProducto.get(0)));
        }
        java.util.List<String> productoLocalidLocal = map.get("productoLocalidLocal");
        if (productoLocalidLocal != null && !productoLocalidLocal.isEmpty()) {
            key.setProductoLocalidLocal(new java.lang.Integer(productoLocalidLocal.get(0)));
        }
        return key;
    }

    public StockProdFacadeREST() {
        super(StockProd.class);
    }

    @POST
    @Override
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(StockProd entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") PathSegment id, StockProd entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") PathSegment id) {
        Entity.StockProdPK key = getPrimaryKey(id);
        super.remove(super.find(key));
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public StockProd find(@PathParam("id") PathSegment id) {
        Entity.StockProdPK key = getPrimaryKey(id);
        return super.find(key);
    }

    @GET
    @Override
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<StockProd> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<StockProd> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
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
