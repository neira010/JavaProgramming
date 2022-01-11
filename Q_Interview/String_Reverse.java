import java.util.Scanner;

public class String_Reverse {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Enter a word:");
        String word = scan.next();

        scan.close();

        String result = "";
        for (int i = word.length()-1 ; i >=0 ; i--) {
            result= result+ word.charAt(i);
        }
        System.out.println("result = " + result);
     /*   if (word.length() == 5){
            result+= word.charAt(4);
            result+= word.charAt(3);
            result+= word.charAt(2);
            result+= word.charAt(1);
            result+= word.charAt(0);
        }else if (word.length()>5){
            result = "Too long!";
        }else{
            result = "Too short";
        }
        System.out.println(result);

      */
    }
}
