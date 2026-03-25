// Print list of odd/even numbers from 1-n, where n is input. 
// E.g.  
// n = 10 
// even_nums = [2, 4, 6, 8, 10] 
// odd_nums = [1, 3, 5, 7, 9]

import java.util.ArrayList;
import java.util.*;
public class EvenOddnumber {
    public static void main(String[] args) {
        int n=10;
        List<Integer>even=new ArrayList<>();
        List <Integer>odd=new ArrayList<>();

        for(int i=1;i<=n;i++){
            if(i%2==0){
                even.add(i);
            }else{
                odd.add(i);
            }
        }
        System.out.println("Even no: "+even);
        System.out.println("Odd no: "+odd);

    }
}
