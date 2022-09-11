package Coursework;

import java.util.Arrays;

public class Easy {
    private static Employee[] employees = new Employee[10];
    public static void main(String[] args) {
        Employee empl1 = new Employee("Евгений", "Доленко", "Викторович", 1, 120000);
        Employee empl2 = new Employee("Никита", "Иконников", "Сергеевич", 1, 140000);
        Employee empl3 = new Employee("Василий", "Быстров", "Анатольевич", 1, 160000);

        employees[0] = empl1;
        employees[1] = empl2;
        employees[2] = empl3;
        Employee[] empl = Arrays.copyOf(employees, 10);

        Arrays.stream(empl).forEach(System.out::println);
        System.out.println(empl.length);
    }
   public static void printEmployess(){
        for(Employee employee : employees) {
              System.out.println(employee);
       }
    }
    public static int calculateTotalSalary(){
        int sum = 0;
        for(Employee employee : employees){
            sum += employee.getSalary();
        }
        return sum;
    }
    public static Employee findEmployeeWithMinSalary(){
        Employee result = employees[0];
        int minSalary = employees[0].getSalary();
        for (Employee employee : employees){
           if(employee.getSalary() < minSalary){
               minSalary = employee.getSalary();
               result = employee;
           }
        }
        return result;
    }
    public static Employee findEmployeeWithMaxSalary(){
        Employee result = employees[0];
        int maxSalary = employees[0].getSalary();
        for (Employee employee : employees){
            if(employee.getSalary() > maxSalary){
                maxSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }
    public static float calculateAverageSalary(){
        return calculateTotalSalary() / (float) employees.length;
    }
    public static void printFullNames(){
        for (Employee employee : employees){
            System.out.println(employee.getLastName());
        }
    }
}
