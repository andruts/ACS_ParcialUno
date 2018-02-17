
package Source;

public class TaxCalculator {
    private static final double MINIMUMSALARY = 88.36;
    
   public double calculateIncomeTax(Worker worker){
       if(worker.getHoursworked() > 96){
           return 1;
       } else {
           return 0;
       } 
   }
}
