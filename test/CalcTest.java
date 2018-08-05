/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vanivasudevan
 */
public class CalcTest {
    
    public CalcTest() {
    }

    /**
     * Test of add method, of class Calc.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int[] number = {1,1,1};
        Calc instance = new Calc();
        int expResult = 3;
        int result = instance.add(number);
        assertEquals(expResult, result);
        int []number1 = {1};
        expResult = 1;
        result = instance.add(number1);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of multiply method, of class Calc.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        int[] number = {1,2,3};
        Calc instance = new Calc();
        int expResult = 6;
        int result = instance.multiply(number);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of countOdd method, of class Calc.
     */
    @Test
    public void testCountOdd() {
        System.out.println("countOdd");
       int[] number = {1,2,3,4,5};
        Calc instance = new Calc();
        int expResult = 3;
        int result = instance.countOdd(number);
        assertEquals(expResult, result);
      
    }
    
}


