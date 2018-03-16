package Employee;



public class Employee {

    private double  tariffPerHour=5.5;
    public int hours;

    public Employee(double tariffPerHour, int hours) {
        this.tariffPerHour = tariffPerHour;
        this.hours = hours;
    }

    public double getTariffPerHour() {
        return tariffPerHour;
    }

    public double getSalary(){
        return getTariffPerHour()*hours;
    }
}
