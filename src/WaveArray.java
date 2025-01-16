import java.util.Scanner;
import  java.util.*;

public class WaveArray {
//    https://www.geeksforgeeks.org/problems/wave-array-1587115621/1?track=amazon-arrays&batchId=192
public static void main(String [] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < arr.length; i++) {
        arr[i] = s.nextInt();
    }
    for(int i=0;i<arr.length;i +=2){
        int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
    }
    for(int i=0;i<arr.length;i ++){
        System.out.println(arr[i]);
    }
}
}
