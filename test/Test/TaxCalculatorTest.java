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
        2. Cálculo correcto de monto exento del 50% de horas extras.
        Se crea una instancia de la clase "Worker" brindandole al constructor 110 horas y una cantidad de dinero aleatoria.
        Se hace enfasis en la cantidad 105 de horas ya que el impuesto no se debe dividir a la mitad.
        */
        double hoursworked = 105;
        double salary = 9366.16;
        Worker worker = new Worker(hoursworked, salary);

        double incometax = new TaxCalculator().calculateIncomeTax(worker);
         System.out.println(incometax);

    }

     @Test
    public void testExentHalfHoursVerification() {
        /*
        3. El monto exento del 50% no excede 5 veces el salario mínimo.
        Se crea una instancia de la clase "Worker" brindandole al constructor 110 horas y una cantidad de dinero aleatoria.
        Se hace enfasis en la cantidad 120 de horas ya que el impuesto se debe dividir a la mitad.
        */
        double hoursworked = 120;
        double salary = 9366.16;
        Worker worker = new Worker(hoursworked, salary);

        double incometax = new TaxCalculator().calculateIncomeTax(worker);
         System.out.println(incometax);

    }

     @Test
    public void testNegativeSalary() {
        /*
        4. El monto exento no puede ser negativo
        Se crea una instancia de la clase "Worker" brindandole al constructor una cantidad equis de horas y una cantidad de dinero negativa.
        El monto exento no puede ser negativo.
        */
        double hoursworked = 97;
        double salary = -9366.16;
        Worker worker = new Worker(hoursworked, salary);

        double incometax = new TaxCalculator().calculateIncomeTax(worker);
         System.out.println(incometax);

    }

}
