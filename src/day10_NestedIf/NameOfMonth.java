package day10_NestedIf;

public class NameOfMonth {

    public static void main(String[] args) {

        int n = 5;
        String name = (n == 1) ? "Jan" : (n == 2) ? "Feb" : (n == 3) ? "Mar" : (n == 4) ? "Apr" : (n == 5) ? "May" : (n == 6) ? "Jun"
                : (n == 7) ? "Jul" : (n == 8) ? "Aug" : (n == 9) ? "Sept" : (n == 10) ? "Oct" : (n == 11) ? "Nov"
                : "Dec";
        System.out.println(name);

        System.out.println("________________________________________");
    /*
        int s = 85;
        if (s >= 0 && s <= 100) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }else{
            System.out.println("Invalid Score");
        }
*/
        int s = 85;
       String result =  (s >= 0 && s<= 100)? (s>=60)? "Passed" : "Failed" : "Invalid score";
        System.out.println(result);
        System.out.println("___________________________");

       String result2 = (s >= 0 && s <= 100)?  (s>=90)? "Excellent"  :(s>80)? "Great"  :(s>=70)? "Good"  :(s>=60)? "Passed"
                : "Failed" : "Invalid score";
        System.out.println(result);






    }
}
