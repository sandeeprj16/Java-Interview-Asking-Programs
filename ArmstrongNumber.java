// A number that equals the sim of its own digits, each raised to power of the totsl number of digits.


// WJP to count number of digits for given number
public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println("armstrong no program");
       
        int num=153;
        int temp=num;
        double sum=0;
        int count=String.valueOf(num).length(); // number count karta h kitne h.

        System.out.println(count);

        while (num>0) {
            int remider=num%10;
            sum=sum+Math.pow(remider, count);
            num/=10;
        }
        if (sum==temp) {
            System.out.println("Armstrong");
        }else{
            System.out.println("Not Armtrong");
        }
    }
}
