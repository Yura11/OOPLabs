import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    private Student[] students;

    public Main(int arraySize) {
        students = new Student[arraySize];
    }

    public void createStudentsArray() {
        students[0] = new Student(); // Assuming you want a default student with a unique ID
        students[1] = new Student(2, "Деревецький", "Олег", "Васильович", LocalDate.parse("2001-03-20"), "+380987654321", "ІТМТПІГ", 2, "КІ-406");
        students[2] = new Student(3, "Якимець", "Володимир", "Петрович", LocalDate.parse("1999-12-10"), "+380555555555", "ІТМТПІГ", 3, "КІ-406");
        students[3] = new Student(4, "Боднар", "Артем", "Володимирович", LocalDate.parse("2002-07-25"), "+380999999999", "ІТМТПІГ", 1, "КІ-412");
        students[4] = new Student(students[0]);
    }

    public void filterByFaculty(String faculty) {
        System.out.println("Students from Faculty " + faculty + ":");
        for (Student student : students) {
            if (student != null && student.getFaculty().equals(faculty)) {
                System.out.println(student);
            }
        }
    }

    public void filterByFaculty() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the faculty to filter by:");
        String faculty = scanner.nextLine();
        filterByFaculty(faculty);
    }

    public void filterByBirthYear(Integer year) {
        System.out.println("Students born after " + year + ":");
        for (Student student : students) {
            if (student != null && student.getBirthDate().getYear() > year) {
                System.out.println(student);
            }
        }
    }

    public void filterByBirthYear() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the birth year to filter by:");
        int year = scanner.nextInt();
        filterByBirthYear(year);
    }

    public void filterByGroup(String group) {
        System.out.println("Students from Group " + group + ":");
        for (Student student : students) {
            if (student != null && student.getGroup().equals(group)) {
                System.out.println(student);
            }
        }
    }

    public void filterByGroup() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the group to filter by:");
        String group = scanner.nextLine();
        filterByGroup(group);
    }

    public void printStudentsArray() {
        System.out.println("All students:");
        for (Student student : students) {
            if (student != null) {
                System.out.println(student);
            }
        }
    }

    public static void main(String[] args) {
        Main mainProgram = new Main(5);

        mainProgram.createStudentsArray();

        mainProgram.filterByFaculty("ІТМТПІГ");
        mainProgram.filterByBirthYear(2000);
        mainProgram.filterByGroup("КІ-406");

        mainProgram.printStudentsArray();

        mainProgram.filterByFaculty();
        mainProgram.filterByBirthYear();
        mainProgram.filterByGroup();
    }
}
