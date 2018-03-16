package Employee;

public class UseEmployee {

    public static void main( String[] args){

        Employee sereoga = new Employee(10.2, 2);

        System.out.println(sereoga.getSalary());
        System.out.println(sereoga.getTariffPerHour());

        Manager man=new Manager(12,2);
        System.out.println(man.getSalary());
        System.out.println(man.getTariffPerHour());
    }
}
