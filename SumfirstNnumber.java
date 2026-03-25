// Print sum of first n numbers 
// E.g. n=5, output=15 (1+2+3+4+5=15) 

public class SumfirstNnumber {
    public static void main(String[] args) {
        int n=5; int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("First nth number sum is: "+sum);
    }
    
}
