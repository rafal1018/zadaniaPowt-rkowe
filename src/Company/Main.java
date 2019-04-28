package Company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Employee emp1 = new Employee(10, 5000, "Programmer");
        Employee emp2 = new Employee(15, 8000, "Programmer");
        Employee emp3 = new Employee(1, 4000, "Secretary");
        Employee emp4 = new Employee(9, 10000, "Programmer");

        List<Employee> list = new ArrayList<>();

        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);

        int i = 0;

        for (Employee e : list){
            System.out.println("(" + i + ")" + "(" + e.getPosition() + ")" + ": " + e.getSalary());
        }

        System.out.println(annualSalary(list));

        empWhoEarnMoreThan(3000, list);
    }

    public static double annualSalary(List<Employee> list1){

        double x = 0;

        for (Employee e : list1){
            if (e.getPosition().equals("Programmer"))
                x = x + e.getSalary();
        }
        return (12*x)/12;
    }

    public static void empWhoEarnMoreThan (double value, List<Employee> list2){

        for(Employee e : list2){

            if (e.getSalary() > value){
                System.out.println("Employee who earn more than " + value + " : " + e.getId());
            }
        }
    }
}
