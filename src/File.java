import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class File {
   public static void file() throws IOException {
       FileReader f = new FileReader("C:\\Users\\ELCOT\\Documents\\Git 24");
       BufferedReader b = new BufferedReader(f);
   }

    public static void main(String[] args) {
        try {
            file();
        }catch (Exception e){
            System.out.println("The file is not found");
        }
    }



}


