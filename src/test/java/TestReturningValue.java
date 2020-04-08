import java.util.Scanner;

public class TestReturningValue {
    public  static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        ReturnValue mon = new ReturnValue();
        System.out.println("Enter a number: ");
        int numValue = sc.nextInt();
        String resp = mon.getMultipleOfNumber(numValue);
        System.out.println(resp);
    }
}
