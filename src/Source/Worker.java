
package Source;

public class Worker {
    private final double hoursworked;
    private final double salary;
    
    public Worker(double hours, double salary){
        this.hoursworked = hours;
        this.salary = salary;
    }

    public double getHoursworked() {
        return hoursworked;
    }

    public double getSalary() {
        return salary;
    }
    
    public double getExtraHours(){
        return this.hoursworked - 96;
    }
    
    public double getPaymentperHour(){
        return this.salary / this.hoursworked;
    }
    
    
}
