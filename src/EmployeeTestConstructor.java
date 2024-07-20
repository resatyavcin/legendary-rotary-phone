import java.util.Date;

public class EmployeeTestConstructor {

    int id;
    String firstName;
    String lastName;
    Date birthDate;
    float salary;
    String department = "No department yet!";


    public EmployeeTestConstructor(int newId, String newFirstName, String newLastName, Date newBirthDate, float newSalary) {
        id = newId;
        firstName = newFirstName;
        lastName = newLastName;
        birthDate = newBirthDate;
        salary = newSalary;
    }


    //Üstteki ile aynı param. ları alırsa hata verir. Overloading olmaz.
    public EmployeeTestConstructor(int newId, String newFirstName, String newLastName, Date newBirthDate, float newSalary, String newDepartment) {
        id = newId;
        firstName = newFirstName;
        lastName = newLastName;
        birthDate = newBirthDate;
        salary = newSalary;
        department =  newDepartment;
    }

    public void EmployeeTestConstructor() {
        System.out.println("FAKE EMPLOYEE TEST CONSTRUCTOR. It is a function");
    }

}
