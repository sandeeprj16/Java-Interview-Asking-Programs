public class FibonacciSeries {
    // public static void main(String[] args) {
    //     int a =0; int b=1; int limit=10;

    //     System.out.print(a+" "+b+" ");

    //     for (int i=3;i<=limit;i++){

    //         int c=a+b;
    //         System.out.print(c+" ");
    //        a=b; b=c;
    //     }

    // }

// Tribonacci Series
    public static void main(String[] args) {
        int a=0,b=1,c=1; int limit =10;
        System.out.print(a+" "+b+" "+c+" ");
        for(int i=4;i<=limit;i++){
            int d=a+b+c;
            a=b;b=c;c=d;
            System.out.print(d+" ");
        }
    }
}
