package groupby;

public class Employee {

    int eid ;
    String name ;
    String dept ;

    public Employee(int eid, String name, String dept) {
        this.eid = eid;
        this.name = name;
        this.dept = dept;
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
                '}';
    }
}
