import java.util.Scanner;

public class Password {
    private static final String CORRECTPASSWORD = "password123";

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the username");
        String username = s.nextLine();
        System.out.println("Enter the password");
        String password = s.nextLine();

        try {
            login(username,password);
            System.out.println("login successfull");
        } catch (InvalidPasswordException e) {
            System.out.println("Error: Incorrect password");
        }

    }


    private static void login(String username, String password) throws InvalidPasswordException {
        if (!password.equals(CORRECTPASSWORD)) {
            throw new InvalidPasswordException();
        }
    }

    private static class InvalidPasswordException extends Throwable {
    }

    }


