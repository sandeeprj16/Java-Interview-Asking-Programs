public class CrossPattern {
    public static void main(String[] args) {
        int r=15,c=15;
        // for(int row=1;row<=r;row++){
        //     for(int col=1;col<=c;col++){
                
        //         if(row==col||row==1||row==r||col==1||col==c){
        //             System.out.print("* ");
        //         }
        //         else {
        //             System.out.print("  ");
        //         }
                
        //     }
        //     System.out.println();
        // }


         for(int row=1;row<=r;row++){
            for(int col=1;col<=c;col++){
                
                if(row==col||row==1||row==r||col==1||col==c||row+col==c+1){
                    System.out.print("  ");
                }
                else {
                    System.out.print("* ");
                }
                
            }
            System.out.println();
        }
    }
}
