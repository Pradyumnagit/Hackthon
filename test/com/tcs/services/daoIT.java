/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tcs.services;

import com.tcs.beans.beans;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 1528178
 */
public class daoIT {
    
    public daoIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calculate method, of class dao.
     * Beans bean
     * testCalculate1()
     * testCalculate2()
     * testCalculate3()
     * testCalculate4()
     * int expResult
     * int result
     */
    @Test
    public void testCalculate1() {
        System.out.println("calculate +++++++++++");        
        beans bean = new beans() ;
        bean.setFirst("3");
        bean.setSecond("4");
        bean.setOperation("Addition");
        int expResult = 7;
        int result = dao.calculate(bean);
        System.out.println(dao.calculate(bean));
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testCalculate2() {
        System.out.println("calculate ----------------");        
        beans bean = new beans() ;
        bean.setFirst("3");
        bean.setSecond("4");
        bean.setOperation("Subtraction");
        int expResult = -1;
        int result = dao.calculate(bean);
        System.out.println(dao.calculate(bean));
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testCalculate3() {
        System.out.println("calculate *********************");        
        beans bean = new beans() ;
        bean.setFirst("3");
        bean.setSecond("4");
        bean.setOperation("Multiplication");
        int expResult = 12;
        int result = dao.calculate(bean);
        System.out.println(dao.calculate(bean));
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testCalculate4() {
        System.out.println("calculate  ///////////////////////////");        
        beans bean = new beans() ;
        bean.setFirst("3");
        bean.setSecond("4");
        bean.setOperation("Division");
        int expResult = 0;
        int result = dao.calculate(bean);
        System.out.println(dao.calculate(bean));
        assertEquals(expResult, result);
        
    }
    
}
