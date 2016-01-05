/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ramesh.javaee6.jsf;

import com.ramesh.javaee6.ejb.ProductDAO;
import com.ramesh.javaee6.entities.Product;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author rpachuno
 */
@Named
@RequestScoped
public class ProductDetailBean {
    private long id;
    private Product product;
    
    @Inject
    private ProductDAO dao;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    
    public void loadProduct(){
        dao.getProduct(id);
    }
    
    
}
