import java.util.Scanner;

public class FindKElement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        int k = s.nextInt();
        int idx = -1;
        for(int i=0; i<arr.length;i++){
            if(arr[i] == k){
                idx = i;
                break;
            }
        }
        System.out.println(idx);
    }
}
