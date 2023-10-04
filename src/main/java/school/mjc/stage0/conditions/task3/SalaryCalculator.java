package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        double finalSalary;
        if (salary > 0 && salary <= 10000) {
            finalSalary = salary - salary * 0.15;
            System.out.println(finalSalary);
        } else if (salary > 10000 && salary <= 20000) {
            finalSalary = salary - salary * 0.18;
            System.out.println(finalSalary);
        } else if (salary > 20000) {
            finalSalary = salary - salary * 0.2;
            System.out.println(finalSalary);
        } else {
            System.out.println("wrong input!");
        }
    }
}