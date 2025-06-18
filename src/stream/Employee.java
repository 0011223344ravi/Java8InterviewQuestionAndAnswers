package stream;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Employee {
    private String empId;
    private String empName;
    private double salary;
    private int age;
    private String project;

    public Employee(String empId, String empName, double salary, int age, String project) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.age = age;
        this.project = project;
    }

    public String getEmpId() {
        return this.empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return this.empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getProject() {
        return this.project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String toString() {
        return "Employee{empId='" + this.empId + "', empName='" + this.empName + "', salary=" + this.salary + ", age=" + this.age + ", project='" + this.project + "'}";
    }
}

