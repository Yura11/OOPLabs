public class Main {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher();


        teacher1.setId(1);
        teacher1.setLastName("Smith");
        teacher1.setFirstName("John");
        teacher1.setMiddleName("Doe");
        teacher1.setDateOfBirth("1990-05-15");
        teacher1.setPhoneNumber("123456789");
        teacher1.setDepartment("Mathematics");
        teacher1.setSubjects(new String[]{"Algebra", "Geometry"});


        System.out.println("Teacher 1:");
        System.out.println(teacher1);


        Teacher teacher2 = new Teacher(2, "Johnson", "Anna", "Marie", "1985-03-20", "987654321", "Physics", new String[]{"Mechanics", "Electricity"});


        System.out.println("\nTeacher 2:");
        System.out.println(teacher2);


        Teacher teacher3 = new Teacher(teacher1);


        System.out.println("\nTeacher 3 (copy of Teacher 1):");
        System.out.println(teacher3);
        Teacher teacher = new Teacher(1, "Smith", "John", "Doe", "1990-05-15", "123456789", "Mathematics", new String[]{"Algebra", "Geometry"});


        System.out.println("Teacher:");
        System.out.println(teacher);


        Student student = new Student(1, "Doe", "Jane", "Mary", "1995-08-20", "987654321", "Computer Science", 3, "CS101");


        System.out.println("\nStudent:");
        System.out.println(student);

        Human[] humans = new Human[4];


        humans[0] = new Teacher(1, "Smith", "John", "Doe", "1990-05-15", "123456789", "Mathematics", new String[]{"Algebra", "Geometry"});
        humans[1] = new Teacher(2, "Doe", "Jane", "Mary", "1985-10-20", "987654321", "Science", new String[]{"Physics", "Chemistry"});
        humans[2] = new Student(101, "Johnson", "Michael", "David", "1998-03-12", "555123456", "Computer Science", 2, "CS101");
        humans[3] = new Student(102, "Brown", "Emma", "Elizabeth", "1997-07-25", "555987654", "Mathematics", 3, "Math201");


        for (Human human : humans) {
            System.out.println(human.toString());
        }
    }
}
