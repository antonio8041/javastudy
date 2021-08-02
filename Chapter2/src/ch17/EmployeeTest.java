package ch17;

public class EmployeeTest {
    public static void main(String[] args) {
        
        Employee employeeLee = new Employee();
        employeeLee.setEmployeeName("potter");

        System.out.println(Employee.getSerialNum());

        Employee employeeKim = new Employee(); 
        employeeKim.setEmployeeName("Amy");
        

        System.out.println(employeeLee.getEmployeeName() + "your serial number is " + employeeLee.getEmployeeId());
        System.out.println(employeeKim.getEmployeeName() + "your serial number is " + employeeKim.getEmployeeId());
        
    }
    
}
