package day10_NestedIf;

public class day10_NestedIfIntro {

    public static void main(String[] args) {
        int score = 95;


        if (score >=0 && score <= 100){

            if (score >= 60){  //if passed exam
                System.out.println("Passed");
            }else{
                System.out.println("Failed");
            }


        }else{  //if the score is not valid
        }

        System.out.println("Invalid score");
        }


    }

