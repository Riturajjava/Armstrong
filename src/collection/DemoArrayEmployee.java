package collection;

import model.Employee;

import java.util.ArrayList;

public class DemoArrayEmployee {

    public static void main (String[] args) {


    // maintain employee data

    // ArrayList <DataType> OBJ_NAME=new ArrayList  <DataType>();

 ArrayList<Employee> employeeArrayList=new ArrayList<Employee>();

    // create records for employee using parameterized constructor
    Employee employee=new Employee("Narendra",29,223,56231.23);
    Employee employee1=new Employee("Dhavendra",35,229,42369.51);
    Employee employee2=new Employee("Gambir",42,421,12356.23);
    Employee employee3=new Employee("Vindo",36,452,45612.21);

    // add data to the list
    employeeArrayList.add(employee);
    employeeArrayList.add(employee1);
    employeeArrayList.add(employee2);
    employeeArrayList.add(employee3);

    // display records or data of students using for each loop
    for (Employee var:employeeArrayList){
       System.out.println("Printing name "+var.getName());
       System.out.println("Printing age "+var.getAge());
       System.out.println("Printing employee_id "+var.getEmp_id());
       System.out.println("Printing salary "+var.getSalary());
    }

    }






}
