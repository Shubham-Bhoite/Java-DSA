// Print Diamond pattern ==>

public class Pattern8 {
    public static void diamond_pattern(int n){
        // 1st half
        for(int i=1; i<=n; i++){
            //spaces print
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            // print stars
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();

        }

        // 2nd half
        for(int i=n; i>=1; i--){
            //spaces print
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            // print stars
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        diamond_pattern(7);
    }
}
