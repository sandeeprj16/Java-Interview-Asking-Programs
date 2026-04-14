// Use while loop and print following pattern: 
// n = 19 
// 1 2 3 4 5 * * * * * 11 12 13 14 15 * * * * 

public class PatternWithNo {
    public static void main(String[] args) {
        int num=19;
        int count=1;
        while(count<=num){
        for(int i=0;i<5 && count<=num;i++){
            System.out.print(count++ +" ");
        }
        for(int i=0;i<5 && count<=num;i++){
            System.out.print("* ");
            count++;

            System.out.print("samdyeeee");
        } }
    }
}
