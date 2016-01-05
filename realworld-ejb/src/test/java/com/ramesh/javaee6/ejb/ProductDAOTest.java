package com.ramesh.javaee6.ejb;

import com.ramesh.javaee6.entities.Product;
//import java.util.List;
import javax.inject.Inject;
//import org.hamcrest.CoreMatchers;
//import static org.hamcrest.CoreMatchers.is;
//import static org.hamcrest.MatcherAssert.assertThat;
//import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import org.jboss.arquillian.container.test.api.Deployment;
import org.testng.annotations.Test;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.arquillian.testng.Arquillian;
//import org.jboss.shrinkwrap.resolver.api.maven.Maven;
import org.testng.Assert;

public class ProductDAOTest extends Arquillian
{

   @Inject
   private ProductDAO productDAO;
   
//   @Deployment
//   public static JavaArchive createDeployment()
//   {
//       
//       
//       JavaArchive testJar = ShrinkWrap.create(JavaArchive.class,"test1.jar")
//               .addClasses(ProductDAO.class,TestDataGenerator.class)
//               .addPackage(Product.class.getPackage())
//               .addAsManifestResource("META-INF/persistence.xml", "persistence.xml")
//               .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
//    
//       
////       JavaArchive[] hamcrestJar = loadJar("org.hamcrest:hamcrest-all:1.3");
////       
////        mergeJars(hamcrestJar, testJar);   
//       
//      return testJar;
//   }

//    private static JavaArchive[] loadJar(String mavenJar) {
//        JavaArchive[] hamcrestJar = Maven.resolver().resolve(mavenJar).withTransitivity().as(JavaArchive.class);
//        return hamcrestJar;
//    }
//
//    private static void mergeJars(JavaArchive[] addlJar, JavaArchive testJar) throws IllegalArgumentException {
//        for(JavaArchive jar: addlJar) {
//            testJar.merge(jar);
//        }
//    }

//   @Test
//   public void should_be_deployed()
//   {
//      Assert.assertNotNull(productDAO);
////      assertThat(productDAO,CoreMatchers.notNullValue());
//   }
   
//   @Test
//   public void should_return_productList()
//   {
//       List<Product> products = productDAO.getProducts();
//       assertThat(products, hasSize(10));
//      
//   }
//   
//    @Test
//   public void testProductListAsc()
//   {
//       List<Product> products = productDAO.getProducts(null, true);
//       assertThat(products.get(0).getPrice(), is(10d));
// 
//      
//   }
//   
//    @Test
//   public void testProductListDesc()
//   {
//       List<Product> products = productDAO.getProducts(null, false);
//       assertThat(products.get(0).getPrice(), is(100d));
// 
//      
//   }
//   
}