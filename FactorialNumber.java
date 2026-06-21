import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        // int a=3;
        System.out.println("Enter number");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int fact=1;
        for(int i=1;i<=a;i++){
             fact=fact*i;
        }
        System.out.println(fact);
    }
}
