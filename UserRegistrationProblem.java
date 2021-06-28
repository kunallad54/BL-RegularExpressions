/***************************************************************************************************
 * UC2
 * Purpose : As a User need to enter a valid Last Name
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
    static UserRegistrationProblem usr = new UserRegistrationProblem();

    public static void main(String[] args) {

        usr.userConsole();

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

    /**
     * Purpose : Check whether last name entered is valid or not it should start with cap
     *           and should have minimum 3 chars
     *
     * @param lastName input from user
     * @return true if valid last name else false
     */
    public boolean checkLastName(String lastName) {

        //first letter should be cap and should have min 3 letters
        String regex = "^[A-Z][a-z]{2,}";
        Pattern p = Pattern.compile(regex);

        if (lastName == null) {
            return false;
        }

        Matcher m = p.matcher(lastName);

        return m.matches();

    }

    /**
     * Purpose : User console to take input from user
     */
    public void userConsole(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the First Name :");
        String firstName = scanner.next();

        System.out.println("Enter the Last Name :");
        String lastName = scanner.next();

        usr.validateDetails(firstName,lastName);
    }

    /**
     * Purpose : It validate user details
     *
     * @param firstName input from user
     * @param lastName input from user
     */
    public void validateDetails(String firstName, String lastName){

        if (usr.checkFirstName(firstName))
            System.out.println("Valid First Name");
        else
            System.out.println("Invalid First Name");

        if(usr.checkLastName(lastName))
            System.out.println("Valid Last Name");
        else
            System.out.println("Invalid Last Name");

    }
}
