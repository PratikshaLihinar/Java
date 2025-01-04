import java.util.Scanner;
//Print Letters of a Word
public class PrintLetterOfWord {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        String word = s.nextLine();
        for(int i = 0; i< word.length(); i++){
            System.out.println(word.charAt(i));
        }
    }
}
