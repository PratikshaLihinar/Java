import java.util.*;
import java.lang.*;
import java.io.*;
public class Weather {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int temp=0;
        int h = 0;
        for(int i=0; i<t;i++){
            temp = s.nextInt();
            h = s.nextInt();
            if(temp >= 30 && h>=90){
                System.out.println("Hot and Humid");
            }else if(temp>=30 &&	h<90){
                System.out.println("Hot");
            }else if(temp<30 &&	h>=90){
                System.out.println("Cool and Humid");
            }else if(temp<30 &&	h<90){
                System.out.println("Cool");
            }
        }
    }
}

//    Weather
//            Beginner
//10 / 10
//        Given the temperature and humidity for the day, determine which category the day's weather falls into.
//
//        Temperature (°C)	Humidity (%)	Weather
//        >=30	>=90	Hot and Humid
//        >=30	<90	Hot
//<30	>=90	Cool and Humid
//<30	<90	Cool
//        Input Format
//        The first line has an integer indicating the number of test cases T
//
//        Next T lines should contain two space-separated integers denoting the temperature and humidity
//
//        Output Format
//        T lines each indicating the weather based on the table shown above.
//
//        Examples
//        Sample Input
//        2
//        34 98
//        23 89
//        Expected Output
//        Hot and Humid
//        Cool
