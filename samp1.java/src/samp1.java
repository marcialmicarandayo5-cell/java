import java.util.Scanner;

public class samp1 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("First Name: ");
            String firstname = input.nextLine();

            System.out.print("Last Name: ");
            String lastname = input.nextLine();

            System.out.print("Course: ");
            String course = input.nextLine();

            System.out.print("Age: ");
            int age = input.nextInt();

            System.out.println("\nFirst Name: " + firstname);
            System.out.println("Last Name: " + lastname);
            System.out.println("Course: " + course);
            System.out.println("Age: " + age);
        }
    }
}


