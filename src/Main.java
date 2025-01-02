// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int salary = 20000;
        if(salary > 5000){
//            salary = salary + 2000;
            salary += 2000;
        }else{
            salary = salary + 1000;
        }
        System.out.println(salary);
    }
}