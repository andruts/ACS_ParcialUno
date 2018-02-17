
package Source;

public class TaxCalculator {
    private static final double MINIMUMSALARY = 88.36;
    
   public double calculateIncomeTax(Worker worker){
       double paymentperhour = worker.getPaymentperHour(); 
       double extrahours = worker.getExtraHours();
       double tax = paymentperhour * extrahours;
       
       if(worker.getHoursworked() > 96 && worker.getSalary() > 0){
           if( verifyExentHours(worker) ){
               return tax / 2;
           }
           return tax;
       } else {
           return 0;
       } 
   }
   
   private boolean verifyExentHours(Worker worker){
       double paymentperhour = worker.getPaymentperHour();
       double extrahours = worker.getExtraHours();
       
       double tax = paymentperhour * extrahours;
       
       return tax > MINIMUMSALARY;
       
       
   }
}
