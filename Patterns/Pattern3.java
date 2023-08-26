// Print Inverted-half pyramid pattern with numbers ==>

public class Pattern3 {
    public static void Inverted_half_pyramid(int n){
        for(int i=1; i<=n; i++){
            // inner numbers
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Inverted_half_pyramid(8);
    }
}
