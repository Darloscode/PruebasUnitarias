/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package tallerpruebas;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author IMPORTSOLUTION
 */
public class EmployeeTest {

    /**
     * Test of cs method, of class Employee.
     */
    
    @Test
    public void testCsWorker() {
        Employee USD = new Employee(400, "USD", 10, EmployeeType.Worker);
        assertEquals(400.00, Math.round(USD.cs() * 100d) / 100d);
    }
    
    @Test
    public void testCsSupervisor(){
        Employee USD = new Employee(400, "USD", 10, EmployeeType.Supervisor);
        assertEquals(403.50, Math.round(USD.cs() * 100d) / 100d);
    }
    
    @Test
    public void testCsManager(){
        Employee USD = new Employee(400, "USD", 10, EmployeeType.Manager);
        assertEquals(407.00, Math.round(USD.cs() * 100d) / 100d);
    }
    
    @Test
    public void testCsNoUSD(){
        Employee noUSD = new Employee(400, "ARG", 10, EmployeeType.Worker);
        assertEquals(380.00, Math.round(noUSD.cs() * 100d) / 100d);
    }
    
    
    /**
     * Test of CalculateYearBonus method, of class Employee.
     */
    @Test
    public void testCalculateYearBonusisNull() {        
        Employee instance = null;
        float expResult = 0;
        float result = instance.CalculateYearBonus();
        assertEquals(expResult, result, 0);        
    }   
    
    @Test
    public void testCalculateYearBonusWorker() {        
        Employee instance = new Employee(344, "USD", 34, EmployeeType.Worker);
        float expResult = 386;
        float result = instance.CalculateYearBonus();
        assertEquals(expResult, result);                
    }
    
    @Test
    public void testCalculateYearBonusSupervisor() {             
        Employee instance = new Employee(344, "USD", 34, EmployeeType.Supervisor);
        float expResult = 537;
        float result = instance.CalculateYearBonus();
        assertEquals(expResult, result);                
    }

    @Test
    public void testCalculateYearBonusManager() {           
        Employee instance = new Employee(344, "USD", 34, EmployeeType.Manager);
        float expResult = 730;
        float result = instance.CalculateYearBonus();
        assertEquals(expResult, result);                
    }
    
    @Test
    public void testCalculateYearBonusNotUSD() {        
        Employee instance = new Employee(344, "EUR", 34, EmployeeType.Worker);
        float expResult = 386;
        float result = instance.CalculateYearBonus();
        assertEquals(expResult, result);              
    }
    
}
