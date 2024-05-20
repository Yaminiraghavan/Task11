import java.util.Scanner;

public class AgeValid {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int age = s.nextInt();
        try {
            validdateage(age);
            System.out.println("Age is valid");
        } catch (InvalidAgeException e) {
            System.out.println("Error :" + e.getMessage());
        }
        
    }

    public static void validdateage(int age) throws InvalidAgeException{
        if (age<18){
                 throw new InvalidAgeException("Age ust be 18 or older");
        }
    }

    static class InvalidAgeException extends Throwable {
        public InvalidAgeException(String message){
            super(message);
        }
    }
}
