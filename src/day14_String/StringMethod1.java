package day14_String;

public class StringMethod1 {

    public static void main(String[] args) {
        String str1 = "     batch    25     ";
        str1 = str1.trim();  //"batch 25"
        System.out.println(str1); //clean white space before and after


        String str2  = "Cydeo School";
        int n1 = str2.indexOf("h");
        System.out.println("n1 = " + n1);

        int n2 = str2.indexOf("o");
        System.out.println("n2 = " + n2);

        String str3 = "Java Programming Language";
        int n3 = str3.indexOf("a");
        System.out.println("n3 = " + n3);

        int n4 =  str3.indexOf("g");
        System.out.println("n4 = " + n4);

        int n5 = str3.indexOf("gua");
        System.out.println("n5 = " +n5);

        int n6 = str3.lastIndexOf("g");
        System.out.println("n6 = "+ n6);

        System.out.println("_____________________________________________________________________");

        String s = "Java Nova Cava Wawa orange";

        int firstA = s.indexOf("a");
        int lastA = s.lastIndexOf("a");
        int secondA = s.indexOf("a ");
        int thirdA = s.indexOf("a C");
        int fourthA = s.indexOf("Ca") +1;
        int fifthA = s.lastIndexOf("a");
        int sixthA = s.indexOf("Nova") +3;




        System.out.println("firstA = "+ firstA);
        System.out.println("lastA = "+ lastA);
        System.out.println("secondA = "+ secondA);
        System.out.println("thirdA = "+ thirdA);
        System.out.println("fourthA = "+ fourthA);
        System.out.println("fifthA = "+ fifthA);
        System.out.println("sixth = "+ sixthA);




















    }
}
