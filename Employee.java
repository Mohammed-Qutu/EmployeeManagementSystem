public class Employee extends Person
{
    private String employeeNumber;

    // No argument constructor
    public Employee() {
        super();
        this.employeeNumber = "";
    }

    // 4 argument constructor
    public Employee(String name, String phoneNumber, String email, String employeeNumber) {
        super(name, phoneNumber, email);
        this.employeeNumber = employeeNumber;
    }

    // Getter and setter method for employee number
    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    // toString method
    public String toString() {
        return super.toString() + "\nEmployee Number: " + employeeNumber;
    }
}
