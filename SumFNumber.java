//  Print sum of first n numbers 
// E.g. n=5, output=15 (1+2+3+4+5=15)

public class SumFNumber {
    public static void main(String[] args) {
        int n=4;
        int sum=0;
        for(int i=0;i<=n;i++){
        
             sum=sum+i;
            }
            System.out.print("First "+n+" number is :"+sum);
    }   
}
