/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ch.bbw.calculator.Calculator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Laura Lüthi
 */
public class TestCalculator {
    
    private Calculator calc;
    public TestCalculator() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        calc = new Calculator();
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testAddieren(){
        calc.addition(2.3, 3.4);
        assertEquals(calc.getResult(), 5.7, 0.01);
    }
    
    @Test
    public void test2NegAddieren(){
        calc.addition(-2.3, -3.4);
        assertEquals(calc.getResult(), -5.7, 0.01);
    }
}
