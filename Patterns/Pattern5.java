// Print 0&1 triangle pattern ==>

public class Pattern5 {
    public static void zero_one_triangle(int n){
        //outer loop
        for(int i=1; i<=n; i++){
            // outer loop
            for(int j=1; j<=i; j++){
                if((i+j)%2 ==0) { //even
                    System.out.print(1);
                }else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        zero_one_triangle(5);
    }
}
