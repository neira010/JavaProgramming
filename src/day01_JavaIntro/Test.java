package day01_JavaIntro;
import day25_CustomMethods_OverLoading.utilities.StringUtility;

public class Test {
    public static void main(String[] args) {
        String str = "Wooden Spoon";

        StringUtility.printEachChar(str);
        System.out.println("___________________");

        String s1 = "Wooden Spoon";
        String reverse = StringUtility.reverse(s1);

        System.out.println(reverse);

        System.out.println("____________________");

        String word = "Civic";
        boolean palindrome = StringUtility.isPalindrome(word);
        System.out.println("palindrome = "+ palindrome);

        System.out.println("___________________________");

        String[] names = {"Anna", "Java", "Python", "racecar", "Mom", "Cydeo"};
        int count = 0;

        for (String each:names) {
            if (StringUtility.isPalindrome(each)){
                count++;
            }
        }

        System.out.println(count);
        System.out.println("____________");

        String s2 = "aaaabbbbbcccddd";
        String nonDup = StringUtility.removeDuplicates(s2);
        System.out.println(nonDup);
    }

}
