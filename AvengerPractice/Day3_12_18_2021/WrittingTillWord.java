package Day3_12_18_2021;

public class WrittingTillWord {
    /*
    Given a non-empty string like "Code" print a string like below output.
                                (do with substring  first)
                                Code → "CCoCodCode"
                                abc → "aababc"
                                ab → "aab"
                                (do with charAt())
                                Code → "C-Co-Cod-Code"
                                abc → "a-ab-abc"
                                ab → "a-ab"
     */
    public static void main(String[] args) {
        //0123
        String word="Code";
/*
    String c=word.substring(0,1);
    System.out.println("c = " + c);
    String co=word.substring(0,2);
    System.out.println("co = " + co);
    String cod= word.substring(0,3);
    System.out.println("cod = " + cod);
    String code= word.substring(0,4);
    System.out.println("code = " + code);
 */



        for (int i = 1; i <=word.length() ; i++) {
            String tem=word.substring(0,i);   // word: "Code"   i:1  tem: "C"
            System.out.print( tem);        //  tem: "C"
        }



    }
}
