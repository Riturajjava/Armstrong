package model;

public class Employee {

    String name;
    int age;
    int emp_id;
    double salary;

    // parameterized contraction


    public Employee (String name, int age, int emp_id, double salary) {
        this.name = name;
        this.age = age;
        this.emp_id = emp_id;
        this.salary = salary;
    }

    // Getter and Setter


    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getAge () {
        return age;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public int getEmp_id () {
        return emp_id;
    }

    public void setEmp_id (int emp_id) {
        this.emp_id = emp_id;
    }

    public double getSalary () {
        return salary;
    }

    public void setSalary (double salary) {
        this.salary = salary;
    }
}
