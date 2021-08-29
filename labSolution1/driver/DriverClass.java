import java.net.SocketPermission;
import java.util.Scanner;

import model.Department;
import model.Employee;
import service.EmailService;

public class DriverClass {
    public static void main(String[] args) {
        Employee employee = new Employee("Taaha", "Siddiqui");
        System.out.println("select your Department.");
        System.out.println("1. Technical \n 2. Admin \n 3. HR  \n 4. Legal");

        Scanner scn = new Scanner(System.in);

        int choice = scn.nextInt();

        EmailService emailService = new EmailService();
        GeneratePassword generatePassword = new GeneratePassword();

        switch (choice) {
            case 1:
                Department department1 = new Department("Technical");

                String email1 = emailService.generateEmail(employee, department1);
                String password1 = generatePassword.generatePassword();
                System.out.println(email1 + " & " + password1);
                break;
            case 2:
                Department department2 = new Department("Admin");

                String email2 = emailService.generateEmail(employee, department2);
                String password2 = generatePassword.generatePassword();
                System.out.println(email2 + " & " + password2);
                break;

            case 3:
                Department department3 = new Department("Legal");

                String email3 = emailService.generateEmail(employee, department3);
                String password3 = generatePassword.generatePassword();
                System.out.println(email3 + " & " + password3);
                break;

            case 4:
                Department department4 = new Department("HR");

                String email4 = emailService.generateEmail(employee, department4);
                String password4 = generatePassword.generatePassword();
                System.out.println(email4 + " & " + password4);
                break;

            default:
                System.out.println("Please enter number between 1 to 4");

        }
    }
}
