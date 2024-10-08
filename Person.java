public class Person 
{
    private String name;
    private String phoneNumber;
    private String email;

    // No argument constructor
    public Person() {
        this("", "", "");
    }

    // 3 argument constructor
    public Person(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    // Getter and setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // toString method
    public String toString() {
        return "Name: " + name + "\nPhone: " + phoneNumber + "\nEmail: " + email;
    }
    
}
