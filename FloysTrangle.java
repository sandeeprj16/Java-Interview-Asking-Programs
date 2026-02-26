public class FloysTrangle {
    // public static void main(String[] args) {
    //     int n=7;int num=10;
    //     for(int r=1;r<=n;r++){
    //         //System.out.println("");

    //         // spaces
    //         for(int s=1;s<=(n-r);s++){
    //             System.out.print("   ");
    //         }
    //         // starts
    //         for(int k=1;k<=(2*r)-1;k++){
    //             System.out.print(num +" "); num++;
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void main(String[] args) {
    //     int n=5;
    //     int num=10;
    //     for (int r=1;r<=n;r++){
    //         for (int s=1;s<=(n-r);s++){
    //             System.out.print("   ");
    //         }
    //         for(int k=1;k<=(2*r)-1;k++){
    //             if(k==1 || k==(2*r)-1 ||r==n){
    //                 System.out.print(num+" ");
    //                 num++;
    //             }
    //             else{
    //                 System.out.print("   ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }

    public static void main(String[] args) {
        int rn=5;
        int cn=5;
        int num=10;
        for(int r=1;r<=rn;r++){
           for(int c=1;c<=cn;c++){
            if(c==1||c==cn||r==1||r==rn||r==c||r+c==rn+1){
                System.out.print(num+" ");
                num++;
            }else{
                System.out.print("   ");
            }
           }
           System.out.println();
        }
    }
}
