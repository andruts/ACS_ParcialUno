package Test;

import Source.Worker;
import Source.TaxCalculator;
import org.junit.Test;
import static org.junit.Assert.*;

public class TaxCalculatorTest {

    @Test
    public void testZeroExtraHours() {
        /*
         1. Calculo de monto exento cero cuando no hay horas extras.
        Se crea una instancia de la clase "Worker" brindandole al constructor 96 horas y una cantidad de dinero aleatoria.
        Se hace enfasis en la cantidad 96 de horas ya que es lo maximo que un trabajador puede trabajar en la quincena. 
        */
        double hoursworked = 96;
        double salary = 6580;
        Worker worker = new Worker(hoursworked, salary);
        
        double incometax = new TaxCalculator().calculateIncomeTax(worker);
            if(incometax > 0) {
                fail("La prueba debería arrojar 0");
            }
        
    }
    
     @Test
    public void testExentHalfHours() {
        /*
         1. Calculo de monto exento cero cuando no hay horas extras.
        Se crea una instancia de la clase "Worker" brindandole al constructor 96 horas y una cantidad de dinero aleatoria.
        Se hace enfasis en la cantidad 96 de horas ya que es lo maximo que un trabajador puede trabajar en la quincena. 
        */
        double hoursworked = 96;
        double salary = 6580;
        Worker worker = new Worker(hoursworked, salary);
        
        double incometax = new TaxCalculator().calculateIncomeTax(worker);
            if(incometax > 0) {
                fail("La prueba debería arrojar 0");
            }
        
    }
    
}
