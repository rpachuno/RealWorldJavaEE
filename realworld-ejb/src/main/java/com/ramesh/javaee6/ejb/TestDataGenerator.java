/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ramesh.javaee6.ejb;

import com.ramesh.javaee6.entities.Product;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author rpachuno
 */
@Singleton
@Startup
public class TestDataGenerator {
    @PersistenceContext
    private EntityManager em;
    
    @PostConstruct
    public void testDataSetup(){
        for(int i=1 ; i<=10 ; i++ ){
            em.persist(new Product("Product " +i, i*10));
        }
    }
}
