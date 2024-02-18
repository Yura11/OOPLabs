import java.util.ArrayList;
import java.util.List;

public class Main {
    private Student[] students;

    public Main(int arraySize) {
        students = new Student[arraySize];
    }


    public void createStudentsArray() {
        students[0] = new Student(1, "Коваль", "Назар", "Олександрович", "2000-05-15", "+380123456789", "ІТМТПІГ", 1, "КІ-406");
        students[1] = new Student(2, "Деревецький", "Олег", "Васильович", "2001-03-20", "+380987654321", "ІТМТПІГ", 2, "КІ-406");
        students[2] = new Student(3, "Якимець", "Володимир", "Петрович", "1999-12-10", "+380555555555", "ІТМТПІГ", 3, "КІ-406");
        students[3] = new Student(4, "Боднар", "Артем", "Володимирович", "2002-07-25", "+380999999999", "ІТМТПІГ", 1, "КІ-412");
        students[4] = new Student(5, "Беліченко", "Юрій", "Ігорівич", "2000-09-05", "+380111111111", "ІТМТПІГ", 2, "КІ-412");
    }


    public void filterByFaculty(String faculty) {
        System.out.println("Students from Faculty " + faculty + ":");
        for (Student student : students) {
            if (student.getFaculty().equals(faculty)) {
                System.out.println(student);
            }
        }
    }


    public void filterByBirthYear(int year) {
        System.out.println("Students born after " + year + ":");
        for (Student student : students) {
            int studentBirthYear = Integer.parseInt(student.getBirthDate().substring(0, 4));
            if (studentBirthYear > year) {
                System.out.println(student);
            }
        }
    }


    public void filterByGroup(String group) {
        System.out.println("Students from Group " + group + ":");
        for (Student student : students) {
            if (student.getGroup().equals(group)) {
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
    }
}
