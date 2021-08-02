package ch17;

public class Employee {

    private static int serialNum = 1000;

    private int employeeId;
    private String employeeName;
    private String department;

    public Employee() {
        serialNum++;
        employeeId = serialNum;
    }
    public static int getSerialNum() { //static 메서드에서는 인스턴스 변수를 사용할 수 없다
        // int i = 0; //지역변수는 상관 없이 사용사능
        // employeeName = "Lee" //인스턴스가 생성되지 않은 상태에서 사용 불가
        return serialNum;
    }
    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
}
