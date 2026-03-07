public class FindLargeNo {
    // public static void main(String[] args) {
    //     int arr[]={9,3,5,1,14,13};
    //     int max=arr[0];

    //     for(int i=1;i<arr.length;i++){
    //         if(max<arr[i]){
    //             max=arr[i];
    //         }
    //     }
    //     System.out.println("Large no:"+max);
    // }

    // find small no

    public static void main(String[] args) {
        int arr[]={9,3,5,1,14,13};
        int min=arr[0];

        for(int i=1;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("Small no:"+min);
    }
}
