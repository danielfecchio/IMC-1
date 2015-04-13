/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;
import junit.framework.TestCase;

/**
 *
 * @author rmoris
 */
public class Ex2Test extends TestCase{
    
    public void testarCalculos() {
        Ex2 ex2 = new Ex2();
        
        ex2.setFaltura("180");
        ex2.setFpeso("72");
        
        ex2.calculosPublico();
        
        assertEquals(ex2.getMassa(), 22.22);
    }
    
    public void testarLimpar() {
        Ex2 ex2 = new Ex2();
        
        ex2.setFpeso("um peso qualquer");
        ex2.setFaltura("uma altura qualquer");
        ex2.setLresultado("um resultado qualqur");
        
        ex2.limparPublico();
        
        assertTrue(ex2.getFpeso().equals(""));
        assertTrue(ex2.getFaltura().equals(""));
        assertTrue(ex2.getLresultado().equals(""));
    }
}
