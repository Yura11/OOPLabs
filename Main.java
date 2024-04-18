import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Student[] students = new Student[10];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(i + 1, "Lastname" + i, "Firstname" + i, "Middlename" + i, "01-01-2000", "123456789", "Faculty" + i, i + 1, "Group" + i);
        }


        Teacher[] teachers = new Teacher[10];
        for (int i = 0; i < teachers.length; i++) {
            teachers[i] = new Teacher(i + 1, "Lastname" + i, "Firstname" + i, "Middlename" + i, "01-01-1980", "987654321", "Department" + i, "Subjects" + i);
        }


        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getLastName().compareTo(s2.getLastName());
            }
        });

        System.out.println("Sorted Students by Last Name:");
        for (Student student : students) {
            System.out.println(student);
        }


        Arrays.sort(teachers, new Comparator<Teacher>() {
            @Override
            public int compare(Teacher t1, Teacher t2) {
                return t1.getFirstName().compareTo(t2.getFirstName());
            }
        });

        System.out.println("\nSorted Teachers by First Name:");
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }

        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int lastNameComparison = s1.getLastName().compareTo(s2.getLastName());
                if (lastNameComparison != 0) {
                    return lastNameComparison;
                }

                return s1.getFirstName().compareTo(s2.getFirstName());
            }
        });

        System.out.println("Sorted Students by Last Name:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
