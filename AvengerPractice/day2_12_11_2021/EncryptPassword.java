package day2_12_11_2021;

public class EncryptPassword {
    public static void main(String[] args) {
        String password = "cydeo";
        char encryptWithChar = 'x';
        String encryptedPassword = "";
        for (int i = 0; i < password.length(); i++) {
            encryptedPassword+= ""+password.charAt(i) + encryptWithChar;

        }

        System.out.println("encryptedPassword = "+encryptedPassword);








    }
}
