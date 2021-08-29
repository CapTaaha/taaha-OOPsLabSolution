import java.util.Random;

import model.Department;
import model.Employee;

public class EmailService {

    String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String smallLetters = "abcdefghijklmnopqrstuvwxyz";
    String numbers = "0123456789";
    String specialCharacters = "!@#$%^&*_=+-/.?<>)";

    String values = capitalLetters + smallLetters + numbers + specialCharacters;

    public String generateEmail(Employee employee, Department department) {
        String email = employee.getFirstName() + employee.getLastName() + '@' + department.getDeptName() + ".email.com";
        return email;
    }

    public String generatePassword() {
        Random random = new Random();
        char pass[] = new char[8];

        for (int i = 0; i < pass.length; i++) {
            pass[i] = values.charAt(random.nextInt(values.length()));
        }

        return pass.toString();
    }

}
