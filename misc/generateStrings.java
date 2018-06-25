import java.util.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class generateStrings{

     private static String[] alphabet = {"", "a", "b", "c", "d", "e",
        "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
        "s", "t", "u", "v", "w", "x", "v", "z"};
     public static void main(String []args){
        String str = "1123";
        genStrings(str,0,"");

        str = "10101010";
        genStrings(str,0,"");
        str ="0";
        genStrings(str,0,"");

        str="1";
        genStrings(str,0,"");

        str="1238192038219038219038";
        genStrings(str,0,"");
     }


     private static void genStrings(String s, int i, String temp){
         if (i== s.length()){
             // Create a stream and catch it to mimic a String array
          ByteArrayOutputStream baos = new ByteArrayOutputStream();
          PrintStream ps = new PrintStream(baos);
          PrintStream old = System.out;
          System.setOut(ps);
          System.out.println(temp);
          System.out.flush();
          System.setOut(old);
          System.out.println("String[]: " + baos.toString());
          return;

         }
         // letter representation of ASCII value
         String str = temp+(alphabet[Integer.parseInt(String.valueOf(s.charAt(i)))]);
           genStrings(s,i+1,str);

        //for Fibonacci Series values
        int tens =Integer.parseInt(String.valueOf(s.charAt(i))) * 10;
        int ones = 0;
         if(i+1<s.length()){
           ones =Integer.parseInt(String.valueOf(s.charAt(i+1)));
         }
         //IF I get 2 values then increment
         //counter by 2
         if ((i+1 < s.length()) && (tens + ones >= 10 && tens+ones<=26)){
             str = temp+alphabet[tens+ones];
             genStrings(s,i+2,str);
         }




     }
}
