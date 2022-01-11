package day2_12_11_2021;

public class RedAndBlue {
    public static void main(String[] args) {

        String word = "redxx";
        String temp = "";
        if (word.startsWith("red"))
            temp="\"red\"";
        else if (word.startsWith("blue"))
            temp="\"blue\"";
        else
            temp="\"\"";


        System.out.println("temp =" +temp);












    }
}
