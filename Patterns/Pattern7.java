// Print Hollow Rhombus pattern ==>

public class Pattern7 {
    public static void Hollow_rhombus(int n){
        for(int i=1; i<=n; i++){
            // print spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }

            // hollow rectangle = print star
            for(int j=1; j<=n; j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Hollow_rhombus(7);
    }

}
