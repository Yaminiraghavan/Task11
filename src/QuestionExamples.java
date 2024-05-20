public class QuestionExamples {
    public static void main(String[] args) {
        try {
            int[] n={1,2,3};
            System.out.println("element at index 3: " + n[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds");
        }

 //      try {
 //          String s= "hello";
 //           System.out.println("index 10: " + s.charAt(10));
 //       }catch (StringIndexOutOfBoundsException e){
 //           System.out.println("Error: String index is out of bound");
        //      }
    }
}
