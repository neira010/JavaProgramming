package practice_12_08_2021;

public class SwitchExample {
    public static void main(String[] args) {

        String animal = "CAT";
        String result = "";

        switch (animal){
            case "DOG":
                result= "domestic animal";
                break;
            case "CAT":
                result= "domestic animal";
                break;
            case "TIGER":
                result= "wild animal";
                break;
            default:
                result= "unknown animal";
                break;

        }


        System.out.println(result);






    }
}
