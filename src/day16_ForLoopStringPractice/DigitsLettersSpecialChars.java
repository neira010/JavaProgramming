package day16_ForLoopStringPractice;

public class DigitsLettersSpecialChars {

    public static void main(String[] args) {


        String str = "Cydeo12345School!@#$%WoodenSpoon";

        String digits = "";  //12345
        String letters = "";  //CydeoSchoolWoodenSpoon
        String specialChar = ""; //!@#$%

        for (int i = 0; i < str.length(); i++) {  //i: index numbers of str (0-last index)

            char ch = str.charAt(i);

            if (ch >= '0' && ch <= '9'){  //if the char is between '0' to '9' then it is digit
                digits += ch;
            }else if (ch >= 'A' && ch <= 'Z'){ //if the char is between 'A' to 'Z' then it is letter
                letters += ch;
            }else if (ch >= 'a' && ch <= 'z'){ //if the char is between 'a' to 'z' then it is letter
                letters += ch;
            }else{
                // if the char is neither digit nor letter then it is special char
                if (ch != ' '){
                    specialChar += ch;
                }

            }

        }

        System.out.println("digits = " + digits);
        System.out.println("letters = "+ letters);
        System.out.println("specialChar = " + specialChar);











    }
}
