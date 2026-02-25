
// (r)row -> 1->n
// (s)spaces 1 ->(n-r)
// (n)stars 1-> (2*r)-1

public class Pyramid {
    // public static void main(String[] args) {
    //     int n =4;
    //     for(int r=1;r<=n;r++){
    //         for(int s=1;s<=n-r;s++){
    //             System.out.print("  ");
    //         }
    //         for(int k=1;k<=(2*r)-1;k++){
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }       
    // }


    // Holo pyramid with method

    // public static void pyramid(int n) {
    //     for(int r=1;r<=n;r++){
    //         // spaces
    //         for(int s=1;s<=(n-r);s++){
    //             System.out.print("  ");
    //         }

    //         // starts
    //         for(int k=1;k<=(2*r)-1;k++){
    //             if (k==1||k==(2*r)-1||r==n){
    //                 System.out.print("* ");
    //             }else{
    //                 System.out.print("0 ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }
    // public static void main(String[] args) {
    //     pyramid(7);
    //     pyramid(3);
    // }


    public static void sytlePyramid(int n) {
        // first half
        for(int r=1;r<=n;r++){
            // spaces
            for(int s=1;s<=(n-r);s++){
                System.out.print("  ");
            }
            // starts
            for(int k=1;k<=(2*r)-1;k++){
                if(k==1||k==(2*r)-1||r==n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        // second half
        for(int r=n-1;r>=1;r--){
            // spaces
            for(int s=1;s<=(n-r);s++){
                System.out.print("  ");
            }
            // starts
            for(int k=1;k<=(2*r)-1;k++){
                if(k==1||k==(2*r)-1||r==n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        sytlePyramid(5);
    }

}
