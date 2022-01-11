package day08_IfStatement;

public class GradeReport {
    public static void main(String[] args) {

/*
        System.out.println( true == !false); // true
        System.out.println( !true != false); // false
        System.out.println( !false == true); // true
        System.out.println(!!false); // false
        System.out.println(!!!true); //false



   */

   int score = 85; //0 ~ 100
   boolean a = score >= 90 || score <= 100;//false
   boolean b = score >= 80 && score <= 89;//true

   boolean c = score >=70 && score <= 79; //false
   boolean d = score >= 60 && score <= 69; //false
   boolean f = score >= 0 && score <= 59; //false

     if (a) {
         System.out.println("Excellent!");
     }

       if (b){
           System.out.println("Great!");
       }
       if (c) {
           System.out.println("Great!");
       }
       if(d) {
           System.out.println("Good!");
       }
       if (f){
           System.out.println("Failed!");
       }




    }
}
