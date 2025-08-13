import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking student data as input
        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter student ID: ");
        int studentID = scanner.nextInt();

        System.out.print("Enter student age: ");
        int studentAge = scanner.nextInt();

        System.out.print("Enter student fee: ");
        float studentFee = scanner.nextFloat();

        System.out.print("Enter student grade: ");
        char studentGrade = scanner.next().charAt(0);

        // Printing student details
        System.out.println();
        System.out.println("==== Student Details ====");
        System.out.println("Name   : " + studentName);
        System.out.println("ID     : " + studentID);
        System.out.println("Age    : " + studentAge);
        System.out.println("Fee    : " + studentFee);
        System.out.println("Grade  : " + studentGrade);

        scanner.close();
    }
}
