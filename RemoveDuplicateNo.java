public class RemoveDuplicateNo {
    public static void main(String[] args) {
        int ar[]={1,2,2,3,4,5,3,5};
        for(int i=0;i<ar.length;i++){
            boolean duplicate=false;

            for(int j=0;j<i;j++){
               if( ar[i]==ar[j]){
                duplicate=true;
               }

            }
            if (!duplicate) {
                System.out.print(ar[i]+" ");
            }
        }
    }
}
