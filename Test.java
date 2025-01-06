package My-school;
import java .util.Scanner;
public class Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number:");
        int a = sc.nextInt();
        System.out.print("Please enter a number:");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum is: "+ sum);
    }
}
