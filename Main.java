import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Marks");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Marks: ");
                double marks = sc.nextDouble();
                students.add(new Student(id, name, marks));
                System.out.println("Student Added!");
            } else if (choice == 2) {
                for (Student s : students) s.showStudent();
            } else if (choice == 3) {
                System.out.print("Enter Name to Search: ");
                String name = sc.nextLine().toLowerCase();
                for (Student s : students) {
                    if (s.getName().toLowerCase().contains(name)) s.showStudent();
                }
            } else if (choice == 4) {
                System.out.print("Enter ID to Update: ");
                int id = sc.nextInt();
                System.out.print("Enter New Marks: ");
                double marks = sc.nextDouble();
                for (Student s : students) {
                    if (s.getId() == id) {
                        s.setMarks(marks);
                        System.out.println("Marks Updated!");
                    }
                }
            } else if (choice == 5) {
                System.out.print("Enter ID to Delete: ");
                int id = sc.nextInt();
                students.removeIf(s -> s.getId() == id);
                System.out.println("Student Deleted!");
            } else if (choice == 6) {
                break;
            } else {
                System.out.println("Invalid Choice!");
            }
        }
        sc.close();
    }
}
