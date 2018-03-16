package Employee;

public class Manager extends Employee {
    public Manager(double tariffPerHour, int hours) {
        super(tariffPerHour, hours);
    }

    public double getSalary(){
        return super.getSalary()*1.5;
    }
}
