/**
 * main
 */
public class Main {

    public static void main(String[] args) {
        try{
            int dividebyzero = 5 / 1;
            System.out.println("rest of code in try block");
        }
        catch(ArithmeticException e){
            System.out.println("aritht" +e.getMessage());
        }
        
       
    }
}