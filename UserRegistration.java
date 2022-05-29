package com.userregistration;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    static Scanner scanner = new Scanner(System.in);

    public void firstName() {
        System.out.println("Enter the first name: ");
        String name = scanner.next();
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{3,}$");
        Matcher match = pattern.matcher(name);

        if (match.matches()) {
            System.out.println("Name is valid");
        } else {
            System.out.println("Name is invalid, Try with another name.");
        }
    }

    public void lastName() {

        System.out.println("Enter the last name: ");
        String name = scanner.next();
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{3,}$");
        Matcher match = pattern.matcher(name);

        if (match.matches()) {
            System.out.println("Name is valid");
        } else {
            System.out.println("Name is invalid, Try with another name.");
        }
    }

    public void email() {

        System.out.println("Enter the email: ");
        String mail = scanner.next();
        Pattern pattern = Pattern.compile("^[a-zA-Z]+[.][A-Za-z]+@[a-zA-Z]+[.]+[a-zA-Z]{2}+[.][A-Za-z]{2}+$");
        Matcher match = pattern.matcher(mail);

        if (match.matches()) {
            System.out.println("email is valid");
        } else {
            System.out.println("email is invalid, Try with another name.");
        }
    }

    public void mobileNumber() {
        System.out.println("Enter the mobile number with country code: ");
        String mobNo = scanner.next();
        Pattern pattern = Pattern.compile("^[0-9]{2}\s[0-9]{10}$");
        Matcher match = pattern.matcher(mobNo);

        if (match.matches()) {
            System.out.println("Mobile number is valid");
        } else {
            System.out.println("Mobile Number is invalid, Try with another number.");
        }
    }

    public void ruleOne() {
        System.out.println("Enter characters for first rule: ");
        String one = scanner.next();
        Pattern pattern = Pattern.compile("^[a-zA-Z]{8,}$");
        Matcher match = pattern.matcher(one);

        if (match.matches()) {
            System.out.println("First Rule is valid");
        } else {
            System.out.println("First Rule is invalid, Try another.");
        }
    }

    public void ruleTwo() {
        System.out.println("Enter characters for second rule: ");
        String one = scanner.next();
        Pattern pattern = Pattern.compile("^[A-Z]{1,}[a-zA-Z]{7,}$");
        Matcher match = pattern.matcher(one);

        if (match.matches()) {
            System.out.println("Second Rule is valid");
        } else {
            System.out.println("Second Rule is invalid, Try another.");
        }
    }

    public void ruleThird() {
        System.out.println("Enter value for third rule: ");
        String third = scanner.next();
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9]{1,}[a-zA-Z0-9]{7,}$");
        Matcher match = pattern.matcher(third);

        if (match.matches()) {
            System.out.println("Third Rule is valid");
        } else {
            System.out.println("Third Rule is invalid, Try another.");
        }
    }


    public void ruleFourth() {
        System.out.println("Enter value for fourth rule: ");
        String fourth = scanner.next();
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9@$!%*#?&]{1,}[a-zA-Z0-9@$!%*#?&]{7,}$");
        Matcher match = pattern.matcher(fourth);

        if (match.matches()) {
            System.out.println("Fourth Rule is valid");
        } else {
            System.out.println("Fourth Rule is invalid, Try another.");
        }
    }

    public boolean firstName(String name) {
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{3,}$");
        return pattern.matcher(name).matches();
    }


    public boolean lastName (String name) {
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{3,}$");
        return pattern.matcher(name).matches();
    }



    public boolean email (String mail) {
        Pattern pattern = Pattern.compile("^[a-zA-Z]+[.][A-Za-z]+@[a-zA-Z]+[.]+[a-zA-Z]{2}+[.][A-Za-z]{2}+$");
        return pattern.matcher(mail).matches();
    }



    public boolean mobileNumber (String mobNum) {
        Pattern pattern = Pattern.compile("^[0-9]{2}\s[0-9]{10}$");
        return pattern.matcher(mobNum).matches();
    }

    public boolean ruleOne (String password){
        Pattern pattern = Pattern.compile("^[a-zA-Z]{8,}$");
        return pattern.matcher(password).matches();
    }


    public boolean ruleTwo (String password){
        Pattern pattern = Pattern.compile("^[a-zA-Z]{1,}[a-zA-Z]{7,}$");
        return pattern.matcher(password).matches();
    }


    public boolean ruleThird (String password){
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9]{1,}[a-zA-Z0-9]{7,}$");
        return pattern.matcher(password).matches();
    }


    public boolean ruleFourth (String password){
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9@$!%*#?&]{1,}[a-zA-Z0-9@$!%*#?&]{7,}$");
        return pattern.matcher(password).matches();

    }
    public static void main(String[] args) {

        UserRegistration check = new UserRegistration();
        check.firstName();
        check.lastName();
        check.email();
        check.mobileNumber();
        check.ruleOne();
        check.ruleTwo();
        check.ruleThird();
        check.ruleFourth();
    }
}