package practice_12_01_2021;

public class PatientInfo {
    public static void main(String[] args) {

        String name = "John";
        int age = 38;
        char gender = 'M';
        String dateOfBirth = "12/01/1983";
        boolean isMarried = true;
        String phoneNumber = "(123)456-7890";
        boolean havingInsurance = true;
        String insuranceNumber = "A12300789";
        String Employer = "Cydeo";
        double copayWithInsurance = 20.00;
        double copayWithoutInsurance = 250.00;

        System.out.println("name: "+name);
        System.out.println("age = "+ age);
        System.out.println("gender = " + gender);
        System.out.println("dateOfBirth = " + dateOfBirth);
        System.out.println("isMarried = " + isMarried);
        System.out.println("phoneNumber = " + phoneNumber);
        System.out.println("havingInsurance = " + havingInsurance);
        System.out.println("insuranceNumber = " + insuranceNumber);
        System.out.println("Employer = " + Employer);
        System.out.println("copayWithInsurance = " + copayWithInsurance);
        System.out.println("copayWithoutInsurance = " + copayWithoutInsurance);

        System.out.println("====Escape Sequences===");
        System.out.println("\tname: "+name+"\n\tage: "+age+"\n\tgender: "+gender+"\n\tdateOfBirth: "+dateOfBirth+"\n\tisMarried: "+isMarried);

        if (havingInsurance){
            System.out.println("copayWithInsurance = " + copayWithInsurance);
        }else{
            System.out.println("copayWithoutInsurance = " + copayWithoutInsurance);
        }



    }
















}
