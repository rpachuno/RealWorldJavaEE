/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ramesh.javaee6.ejb;

import com.ramesh.javaee6.entities.Product;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author martin
 */
@Stateless

public class ProductDAO {
    
    @PersistenceContext(name = "ProductPU")
    private EntityManager em;
    
    public List<Product> getProducts(String filter, boolean asc) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Product> cq = cb.createQuery(Product.class);
        Root<Product> product = cq.from(Product.class);
        cq.select(product);
        
        if(asc){
           cq.orderBy(cb.asc(product.get("price")));
        }
        else{
            cq.orderBy(cb.desc(product.get("price")));
        }
                
        return em.createQuery(cq).getResultList();
    }
    
    public List<Product> getProducts() {
        return getProducts(null, true);
    }

   public Product getProduct(long pid){
       return em.find(Product.class, pid);
   }

}
