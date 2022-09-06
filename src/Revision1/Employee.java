package Revision1;

import java.util.List;

public class Employee {

    int eid ;
    String name ;
    String dept ;

    List<String > mobileNo;

    double salary ;

    public Employee(int eid, String name, String dept, List<String> mobileNo, double salary) {
        this.eid = eid;
        this.name = name;
        this.dept = dept;
        this.mobileNo = mobileNo;
        this.salary = salary;
    }

    public Employee(int eid, String name, String dept, List<String> mobileNo) {
        this.eid = eid;
        this.name = name;
        this.dept = dept;
        this.mobileNo = mobileNo;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public List<String> getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(List<String> mobileNo) {
        this.mobileNo = mobileNo;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", mobileNo=" + mobileNo +
                ", salary=" + salary +
                '}';
    }
}
