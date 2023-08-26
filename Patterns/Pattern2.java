// Print Inverted and Rotated Half Pyramid ==>

public class Pattern2 {
    public static void Inverted_Rotated_half_Pyramid(int n){
        // loop
        for(int i=1; i<=n; i++){
            // print spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            // print star
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Inverted_Rotated_half_Pyramid(5);
    }
}
