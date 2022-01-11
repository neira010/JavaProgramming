package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {

       int[] myGroup = new int[5];

       // System.out.println(myGroup);  //hashcode

        System.out.println(Arrays.toString(myGroup));  //["Gunay", "Neira", "Suat", "Hulya", "Mikael"]

        System.out.println("____________________________________________________________");

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        System.out.println(Arrays.toString(days) );

        int number = 12;
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December",};

        for (int i = 0; i < 12; i++) {
            System.out.println( months[i]);
        }


        /*
        System.out.println(months[0]);
         System.out.println(months[2]);
        System.out.println(months[3]);
        System.out.println(months[4]);
        System.out.println(months[5]);
        System.out.println(months[6]);
        System.out.println(months[7]);
        System.out.println(months[8]);
        System.out.println(months[9]);
        System.out.println(months[10]);
        System.out.println(months[11]);
         */
     System.out.println("______________________________________________________");

     for (int i = months.length-1; i > 0; i--){  //i- represents the index numbers of array starting from last index
      System.out.println(months[i]);

     }

















    }
}
