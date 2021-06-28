/***************************************************************************************************
 *
 * Purpose : As a User need to enter a valid First Name
 *          - First name starts with Cap and has
 *            minimum 3 characters
 *
 * @author Krunal Lad
 * @Since 28-06-2021
 *
 ***************************************************************************************************/

package com.company.day19;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationProblem {
    public static void main(String[] args) {

        UserRegistrationProblem usr = new UserRegistrationProblem();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Name :");
        String firstName = scanner.next();

        if (usr.checkFirstName(firstName))
            System.out.println("Valid First Name");
        else
            System.out.println("Invalid First Name");
    }

    /**
     * Purpose : Check whether first name entered is valid or not it should start with cap
     *           and should have minimum 3 chars
     *
     * @param firstName input from user
     * @return true if it is valid else false
     */
    public boolean checkFirstName(String firstName) {

        //first letter should be cap and should have min 3 letters
        String regex = "^[A-Z][a-z]{2,}";
        Pattern p = Pattern.compile(regex);

        if (firstName == null) {
            return false;
        }

        Matcher m = p.matcher(firstName);

        return m.matches();

    }
}
