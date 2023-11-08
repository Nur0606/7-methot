import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Apartment apartment1 = new Apartment("Kv A", 1000, "Jal");
        Apartment apartment2 = new Apartment("Kv B", 800, "Dordoy");

        Student[] students1 = new Student[3];
        students1[0] = new Student("Nur1", "123-456-7890", "Jal", "123456");
        students1[1] = new Student("Nur2", "987-654-3210", "Jal", "987654");
        students1[2] = new Student("Nur3", "555-123-7890", "Jal", "555123");

        Student[] students2 = new Student[3];
        students2[0] = new Student("Nur4", "111-222-3333", "Dordoy", "111222");
        students2[1] = new Student("Nur5", "444-555-6666", "Dordoy", "444555");
        students2[2] = new Student("Nur6", "777-888-9999", "Dordoy", "777888");

        apartment1.payPerMonth(students1);
        apartment1.printApartmentDetailsWithStudents(students1);

        apartment2.payPerMonth(students2);
        apartment2.printApartmentDetailsWithStudents(students2);

        students1[0].liveIn(apartment1, students1);
    }
}