

public class Teacher extends Human {
    private int id;
    private String lastName;
    private String firstName;
    private String middleName;
    private String dateOfBirth;
    private String phoneNumber;
    private String department;
    private String subjects;


    public Teacher() {
    }


    public Teacher(int id, String lastName, String firstName, String middleName, String dateOfBirth, String phoneNumber, String department, String subjects) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.department = department;
        this.subjects = subjects;
    }


    public Teacher(Teacher other) {
        this.id = other.id;
        this.lastName = other.lastName;
        this.firstName = other.firstName;
        this.middleName = other.middleName;
        this.dateOfBirth = other.dateOfBirth;
        this.phoneNumber = other.phoneNumber;
        this.department = other.department;
        this.subjects = other.subjects;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSubjects() {
        return subjects;
    }

    public void setSubjects(String subjects) {
        this.subjects = subjects;
    }


    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", department='" + department + '\'' +
                ", subjects=" + subjects + '\'' +
                '}';
    }
    public String getInfo() {

        return "Teacher Info: " + getLastName() + " " + getFirstName();
    }
}