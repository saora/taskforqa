import java.util.InputMismatchException;
import java.util.Scanner;

public class TestReturningValue {
    public  static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        ReturnValue mon = new ReturnValue();
        System.out.println("Enter a number: ");
        try {
            int numValue = sc.nextInt();
            String resp = mon.getMultipleOfNumber(numValue);
            System.out.println(resp);
        }catch (InputMismatchException e){
            System.out.println("Invalid number: "+e.getMessage());
        }

    }
}
