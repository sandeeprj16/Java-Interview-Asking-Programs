
// sum any two number which sum is target value
public class SumTwoNumberTarget {
    public static void main(String[] args) {
        
        int a[]={1,3,2,5,6};
        int sum=9;
        for(int i=0;i<a.length;i++){
            for(int s = i+1;s<a.length;s++){
               if( a[i]+a[s]==sum){
               System.out.println(a[i]+" ,"+a[s]); 
               }
            }
        }
        System.out.println("No pair found");
    }
}
