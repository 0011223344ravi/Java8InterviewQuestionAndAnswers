package stream;


import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestMain {
    public static void main(String[] args) {
        List<Employee> empList = List.of(new Employee("101", "John", (double)50000.0F, 30, "Amex"), new Employee("102", "Vega", (double)50000.0F, 30, "JPMC"), new Employee("103", "Atul", (double)60000.0F, 32, "Boing"), new Employee("104", "Ravi", (double)70000.0F, 40, "Hurman"), new Employee("105", "Sumit", (double)80000.0F, 33, "Allianz"), new Employee("106", "Alok", (double)81000.0F, 35, "Walmart"), new Employee("107", "Soham", (double)82000.0F, 36, "Accenture"), new Employee("108", "Narayan", (double)83000.0F, 48, "TCS"), new Employee("109", "Krish", (double)50000.0F, 32, "HCL"), new Employee("110", "Rahul", (double)51000.0F, 37, "HCL"), new Employee("111", "Ankit", (double)90000.0F, 36, "Manhaton"));
        List<Employee> employeeList = empList.stream().filter((e) -> e.getSalary() > (double)80000.0F).toList();
        List<Employee> employeeList1 = (List)empList.stream().filter((e) -> e.getSalary() > (double)80000.0F).collect(Collectors.toList());
        List<Double> collectSalary = (List)empList.stream().filter((e) -> e.getAge() > 33).map((e) -> e.getSalary()).collect(Collectors.toList());
        Map<String, Double> collectMapofEmmployeeSalary = (Map)empList.stream().filter((e) -> e.getAge() > 33).collect(Collectors.toMap((e) -> e.getEmpName(), (e) -> e.getSalary()));
        List<Employee> collectSortedEmployeeOnName = (List)empList.stream().sorted(Comparator.comparing(Employee::getEmpName)).collect(Collectors.toList());
        List<Employee> collectSortedEmployeeOnSalary = (List)empList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).collect(Collectors.toList());
        Map<String, List<Employee>> collectGroupByProject = (Map)empList.stream().collect(Collectors.groupingBy((e) -> e.getProject()));
        boolean hclAllMatch = empList.stream().allMatch((e) -> e.getProject().equals("HCL"));
        boolean hclNonMatch = empList.stream().noneMatch((e) -> e.getProject().equals("HCL"));
        boolean hclAnyMatch = empList.stream().anyMatch((e) -> e.getProject().equals("HCL"));
        List<Employee> collectLimit = (List)empList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(2L).skip(1L).collect(Collectors.toList());
        System.out.println(collectLimit);
    }
}

