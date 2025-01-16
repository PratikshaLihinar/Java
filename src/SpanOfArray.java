import java.util.Scanner;

public class SpanOfArray {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = s.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }

            if(arr[i]<min){
                min = arr[i];
            }
        }
        int span = max - min;
        System.out.println(min);
        System.out.println(max);
        System.out.println(span);
    }
}
