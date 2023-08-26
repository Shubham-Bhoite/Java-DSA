// Print FLOYD'S Triangle ==>

public class Pattern4 {
    public static void floyd_triangle(int n){
        // outer loop
        int counter =1;
        for(int i=1; i<=n; i++){
            // print counter
            for(int j=1; j<=i; j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        floyd_triangle(7);
    }
}
