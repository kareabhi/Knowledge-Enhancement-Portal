import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Course> courses = new ArrayList<>();
        ArrayList<Course> myCourses = new ArrayList<>();

        courses.add(new Course(1, "Java Basics", "Programming"));
        courses.add(new Course(2, "Python for Beginners", "Programming"));
        courses.add(new Course(3, "Communication Skills", "Soft Skills"));
        courses.add(new Course(4, "Aptitude & Reasoning", "Placement"));

        while (true) {
            System.out.println("\n--- Knowledge Enhancement Portal ---");
            System.out.println("1. Browse Courses");
            System.out.println("2. Enroll in Course");
            System.out.println("3. My Courses");
            System.out.println("4. Search Course");
            System.out.println("5. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                for (Course c : courses) c.showCourse();
            } else if (choice == 2) {
                System.out.print("Enter Course ID to Enroll: ");
                int id = sc.nextInt();
                for (Course c : courses) {
                    if (c.getId() == id) {
                        myCourses.add(c);
                        System.out.println("Enrolled in " + c.getTitle());
                    }
                }
            } else if (choice == 3) {
                System.out.println("\n--- My Courses ---");
                for (Course c : myCourses) c.showCourse();
            } else if (choice == 4) {
                System.out.print("Enter Course Name to Search: ");
                String name = sc.nextLine().toLowerCase();
                for (Course c : courses) {
                    if (c.getTitle().toLowerCase().contains(name)) {
                        c.showCourse();
                    }
                }
            } else if (choice == 5) {
                break;
            } else {
                System.out.println("Invalid Choice!");
            }
        }
        sc.close();
    }
}
