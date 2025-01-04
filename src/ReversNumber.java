import java.util.Scanner;

public class ReversNumber {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while(n>0){
            int digit = n%10;
            n = n/10;
            System.out.println(digit);
        }
    }
}
