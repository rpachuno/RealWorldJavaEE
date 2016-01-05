/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ramesh.javaee6.jsf;


import com.ramesh.javaee6.ejb.ProductDAO;
import com.ramesh.javaee6.entities.Product;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 *
 * @author rpachuno
 */
@Named(value = "productController")
@RequestScoped
public class ProductController {

    /**
     * Creates a new instance of ProductController
     */
    public ProductController() {
    }
    
    private boolean order = true;
    
    private List<Product> products;
    
    @Inject
    private ProductDAO dao;
    
    public List<Product> getProducts(){
        if(products == null){
            products = dao.getProducts(null, order);
        }
        return products;
    }

    public boolean isOrder() {
        return order;
    }

    public void setOrder(boolean order) {
        this.order = order;
//        products = null;
    }
    
    
}
