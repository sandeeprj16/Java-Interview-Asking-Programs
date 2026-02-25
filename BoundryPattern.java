
// Google Interview Question

import java.util.Scanner;

public class BoundryPattern {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter total row");
        // int rn=sc.nextInt();

        // System.out.println("Enter total column");
        // int cn=sc.nextInt();
        int rn=5;int cn=5;

        for (int r=1;r<=rn;r++){
            for(int c=1;c<=cn;c++){
                if(r==1 || c==1 || r==rn || c==cn ){
                    System.out.print("* ");

                }else{
                    System.out.print("RL");
                }
            }
            System.out.println();
            
        }

    }
}
