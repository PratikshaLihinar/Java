import java.util.Scanner;

public class Pattern {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

//        1
//        *
//        **
//        ***
//        ****
//        *****

//        for(int i = 1; i <= n; i++){
//            for(int j=1; j<=i; j++){
//                System.out.print("*\t");
//            }
//            System.out.println();
//        }

//        2
//         *****
//         ****
//         ***
//         **
//         *

//        for(int i = n; i >= 1; i--){
//            for(int j = 1; j <= i ;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        3  sp = space st = star
//              *
//             **
//            ***
//        int sp = n-1;
//        int st = 1;
//        for(int i = 1; i<= n;i++){
//            for(int j =1; j<= sp;j++){
//                System.out.print(" ");
//            }
//            for(int j=1; j<=st; j++){
//                System.out.print("*");
//            }
//            sp--;
//            st++;
//            System.out.println();
//        }


//        4
//              sp  st
//        *****  0  5
//         ****  1  4
//          ***  2  3
//           **  3  2
//            *  4  1

        int space = 0;
        int star = n;

        for(int i =1; i<=n;i++){
            for(int j = 1; j<=space; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=star; j++){
                System.out.print("*");
            }
            space++;
            star--;
            System.out.println();
        }









    }
}
