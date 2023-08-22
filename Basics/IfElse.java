public class IfElse{
    public static void main(String args[]){
        int age= 15;
        if (age >= 18){
            System.out.println("Adult : drive, vote");
        }

        if (age >13 && age <18){
            System.out.println("Teenager");
        }

        else{
            System.out.println("Not adult");
        }
    }
}