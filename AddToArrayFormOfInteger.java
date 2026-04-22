// Add to Array-Form of Integer” problem.
// a = {1, 3, 2, 4}
// k = 142
// Think of the array as a number:
// 1324 + 142 = 1466.
// Result in array form:
// {1, 4, 6, 6}

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AddToArrayFormOfInteger {
    public static void main(String[] args) {
        int arr[]={2,4,1,5};
        int k=143;

        List<Integer> result=new ArrayList<>();

        int i=arr.length-1;

        while(i>=0||k>0){
            if(i>=0){
                k+=arr[i];
                i--;
            }
            result.add(k%10);  //last digit
            k/=10;  //carry forward
        }
        Collections.reverse(result);
        System.out.println(result);
    }
}
