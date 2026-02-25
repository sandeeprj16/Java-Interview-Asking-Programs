public class FloysTrangle {
    public static void main(String[] args) {
        int n=7;int num=10;
        for(int r=1;r<=n;r++){
            //System.out.println("");

            // spaces
            for(int s=1;s<=(n-r);s++){
                System.out.print("   ");
            }
            // starts
            for(int k=1;k<=(2*r)-1;k++){
                System.out.print(num +" "); num++;
            }
            System.out.println();
        }
    }
}
