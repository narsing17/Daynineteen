package com.userregistration;
import java.util.Scanner;
public class UserRegistrationMain {
    public static void main(String[] args) {

        System.out.println("Welcome to User Registration System Problem");

        UserRegistration user = new UserRegistration();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1 : to validate First Name ");
        System.out.println("Enter 2 : to validate Last Name ");
        System.out.println("Enter 3 : to validate E-mail Address ");
        System.out.println("Enter 4 : to validate Mobile Number ");
        System.out.println("Enter 5 : to validate Password Rule 1 ");
        System.out.println("Enter 6 : to validate Password Rule 2 ");
        System.out.println("Enter 7 : to validate Password Rule 3 ");
        System.out.println("Enter 8 : to validate Password Rule 4 ");

        System.out.println("Enter your coice:");
        int choice = scanner.nextInt();
        switch (choice) {

            case 1:
                user.firstName();
                break;
            case 2:
                user.lastName();
                break;
            case 3:
                user.email();
                break;
            case 4:
                user.mobileNumber();
                break;
            case 5:
                user.ruleOne();
                break;
            case 6:
                user.ruleTwo();
                break;
            case 7:
                user.ruleThird();
                break;
            case 8:
                user.ruleFourth();
                break;
            default:
                System.out.println("Invalid! Select a valid number");
        }
    }
}
