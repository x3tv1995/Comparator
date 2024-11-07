package org.example;

import junit.framework.Assert;
import junit.framework.TestCase;
public class ProductTest extends TestCase {

    private Product product;

    @Override
    protected void setUp() throws Exception {
       product = new Product("A",100);
    }



    public void testCreateDateTime() {
       Product product1 =  new Product("A",100);
        Assert.assertEquals(product1,product);

        for (int i = 0; i < 10; i++) {
            try {
                product = new Product("A",100);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println(product);
        }

    }
}