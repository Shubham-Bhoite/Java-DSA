public class TernaryOperator {
    public static void main(String args[]){
        int number = 12;

        String type= ((number %2)==0) ? "Even" : "Odd";
        System.out.println(type);
    }
}
