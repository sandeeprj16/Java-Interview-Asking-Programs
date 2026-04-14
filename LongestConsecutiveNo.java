// array {100,1,200,4,2,3} find longest length of consecative number --> answer is 4

import java.util.Arrays;

public class LongestConsecutiveNo {
    public static void main(String[] args) {
        System.out.println("Longest length consecutive");

        int array[]={100,1,200,4,2,3};

        Arrays.sort(array);

        int max=1; int len=1;

        for(int i=1;i<array.length;i++){
            if (
                array[i]==array[i-1]
            ) continue;

            if (array[i]==array[i-1]+1) 
                len++;
            else
                len=1;
            max= Math.max(max, len);
        }
        System.out.println(max);
    }
}
