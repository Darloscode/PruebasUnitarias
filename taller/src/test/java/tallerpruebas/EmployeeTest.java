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
    
}
