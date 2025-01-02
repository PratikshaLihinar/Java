import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        for(int i=1; i<=5; i++){
//           System.out.println(i);
//        }
        int n = in.nextInt();
//        for (int i = 1; i <= n; i++){
//            System.out.print(i + " ");
//        }
//        int num = 1;
//        while(num <= n ){
//            System.out.println(num);
//            num++;
//        }
// Perfect squ
//            int count=0;
//            for(int i=1; i*i < n; i++){
//                count++;
//            }

        //
        int count=0;
        int temp = n;
        for(int i=1; n > 0; i++){
            int digit = n % 10;
            if( digit != 0 && temp % digit == 0){
                count++;
            }
            n=n/10;
        }
//        return count;
            System.out.print(count);
        }


}
