public class Diamond {
    // public static void main(String[] args) {
    //     int n =5;
    //     //1st half
    //     for (int r=3;r<=n;r++){
    //         for (int s=1;s<=n-r;s++){
    //             System.out.print("  ");
    //         }
    //         for(int k=1;k<=(2*r)-1;k++){
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }

    //     // 2nd half
    //     for (int r=n-1;r>=1;r--){
    //         for (int s=1;s<=n-r;s++){
    //             System.out.print("  ");
    //         }
    //         for(int k=1;k<=(2*r)-1;k++){
    //             System.out.print("o ");
    //         }
    //         System.out.println();
    //     }
    // }
    

    // Diamond Holo

    public static void main(String[] args) {
        int n=5;
   
        //1st half
        for (int r=3;r<=n;r++){
            for (int s=1;s<=n-r;s++){
                System.out.print("  ");
            }
            for(int k=1;k<=(2*r)-1;k++){
               // System.out.print("* ");
               if (k==1||k==(2*r)-1||r==1||r==3) {
                System.out.print("* ");
               }
               else{
                System.out.print("O ");
               }
            }
            System.out.println();
        }

        // 2nd half
        for (int r=n-1;r>=1;r--){
            for (int s=1;s<=n-r;s++){
                System.out.print("  ");
            }
            for(int k=1;k<=(2*r)-1;k++){
                // System.out.print("o ");
                if (k==1||k==(2*r)-1) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("i ");
                }
            }
            System.out.println();
        }
    }
    

}
