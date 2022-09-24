package org.example.classes_and_interfaces.usr_validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidator {
    public String[] validateEmails(String email, String
            alternativeEmail) {
        String[] emailsToCheck = {email, alternativeEmail};
        for (int i = 0; i < emailsToCheck.length; i++) {
            if (emailsToCheck[i] == null || emailsToCheck[i].isEmpty() || !validate(emailsToCheck[i])) {
                emailsToCheck[i] = "unknown";
            }
        }
        return emailsToCheck;
    }

    public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z\\d._%+-]+@[A-Z\\d.-]+\\.[A-Z2,б$]", Pattern.CASE_INSENSITIVE);

    public static boolean validate(String emailStr) {
        Matcher matcher =
                VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
        return matcher.find();
    }
}
