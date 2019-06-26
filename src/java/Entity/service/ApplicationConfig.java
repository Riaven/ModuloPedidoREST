/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity.service;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author Riaven
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(Entity.service.CartaFacadeREST.class);
        resources.add(Entity.service.CategoriaFacadeREST.class);
        resources.add(Entity.service.ComenLocalFacadeREST.class);
        resources.add(Entity.service.ComentarioRepFacadeREST.class);
        resources.add(Entity.service.DetLocRepFacadeREST.class);
        resources.add(Entity.service.EstadoFacadeREST.class);
        resources.add(Entity.service.FavoritoFacadeREST.class);
        resources.add(Entity.service.FranquiciaFacadeREST.class);
        resources.add(Entity.service.LocalFacadeREST.class);
        resources.add(Entity.service.LocalidadFacadeREST.class);
        resources.add(Entity.service.PedidoFacadeREST.class);
        resources.add(Entity.service.ProductoFacadeREST.class);
        resources.add(Entity.service.PromoFacadeREST.class);
        resources.add(Entity.service.RepartidorFacadeREST.class);
        resources.add(Entity.service.StockProdFacadeREST.class);
        resources.add(Entity.service.TarjetaFacadeREST.class);
        resources.add(Entity.service.TipoTarjetaFacadeREST.class);
        resources.add(Entity.service.UsuarioFacadeREST.class);
    }
    
}
