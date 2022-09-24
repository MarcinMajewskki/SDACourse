package org.example.classes_and_interfaces.usr_validator;


public class Main {
    public static void main(String args[]) {
        UserValidator userValidator = new UserValidator();
        String[] failExample = userValidator.validateEmails("ex@.com",
                "yahoo.com");
        String[] correctExample = userValidator.validateEmails("example@gmail.com",
                "wooah@HiNiceToSeeYouHereInMyRepository.com");
        System.out.println(failExample[0] + " " + failExample[1]);
        System.out.println(correctExample[0] + " " + correctExample[1]);
    }
}
