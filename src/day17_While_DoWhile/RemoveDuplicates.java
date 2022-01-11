package day17_While_DoWhile;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "AABBCC";
        String result = "";  //A


        for (int i = 0; i < str.length(); i++) {
            char ch =str.charAt(0);  // "A" "A" "B" "B" "C" "C"
           if(result.contains(""+ch)){  //if the result already contains the char
              // break;  //exit
               continue;  //skip
           }
           result += ch;

        }

        System.out.println(result);













    }
}
