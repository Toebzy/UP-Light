package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        loginScreen();
    }

    public static void loginScreen() {
        SQL SQL = new SQL();
        MainMenu mainMenu = new MainMenu();

        System.out.println("------------------------------");
        System.out.println("Welcome to Gnoxi Food Tracker! \n 1. Log in \n 2. Sign up");
        System.out.println("------------------------------");

        Scanner keyboard = new Scanner(System.in);

        boolean loggingIn = false;
        boolean signingUp = false;

        try {
            int intInputMain = keyboard.nextInt();

            if (intInputMain == 1) {
                loggingIn = true;
            } else if (intInputMain == 2) {
                signingUp = true;
            } else if (intInputMain != 1 || intInputMain != 2) {
                spaces();
                System.out.println("--------------------------------");
                System.out.println("Please input '1' or '2' instead");
                loginScreen();          //returns to login, if number is wrong
            }
        } catch (Exception e) {
            spaces();
            System.out.println("--------------------------------");
            System.out.println("Please input '1' or '2' instead");
            loginScreen();             //returns to login, if input is wrong
        }
        while (loggingIn) {
            System.out.println("-------------------");
            System.out.println("Type your username:");
            System.out.println("--------------------");
            String inputusername = new Scanner(System.in).nextLine();
            System.out.println("-------------------");
            System.out.println("Type your password:");
            System.out.println("-------------------");
            String inputpassword = new Scanner(System.in).nextLine();
            if (SQL.loginCheck(inputusername, inputpassword)) {
                spaces();
                System.out.println("---------------------");
                System.out.println("You are now logged in");
                System.out.println("---------------------");
                loggingIn = false;
                mainMenu.runMainMenu();

            } else {
                spaces();
                System.out.println("----------------");
                System.out.println("Incorrect log-in");
                System.out.println("----------------");
                loginScreen();
            }
        }
        while (signingUp) {
            try {
                Scanner keyboardsignup = new Scanner(System.in);

                System.out.println("------------------");
                System.out.println("Select a username:");
                System.out.println("------------------");
                String signupName = keyboardsignup.nextLine();

                System.out.println("------------------");
                System.out.println("Select a password:");
                System.out.println("------------------");
                String signupPassword = keyboardsignup.nextLine();

                System.out.println("------------------");
                System.out.println("Enter your email:");
                System.out.println("------------------");
                String signupMail = keyboardsignup.nextLine();

                System.out.println("------------------");
                System.out.println("Enter your height:");
                System.out.println("------------------");
                int signupHeight = keyboardsignup.nextInt();

                System.out.println("------------------");
                System.out.println("Enter your weight:");
                System.out.println("------------------");
                int signupWeight = keyboardsignup.nextInt();

                System.out.println("------------------");
                System.out.println("Enter your age:");
                System.out.println("------------------");
                int signupAge = keyboardsignup.nextInt();

                System.out.println("------------------------");
                System.out.println("Enter your gender (M/F):");
                System.out.println("------------------------");
                String signupGender = keyboardsignup.nextLine();

                System.out.println("-------------------------------------------------------------------------");
                System.out.println("Enter your activity level:");
                System.out.println("1: Little or no exercise");
                System.out.println("2: Light exercise (light exercise/sports 1-3 days/week) ");
                System.out.println("3: Moderately active  (moderate exercise/sports 3-5 days/week)");
                System.out.println("4: Very active (hard exercise/sports 6-7 days a week)");
                System.out.println("5: Extra active (very hard exercise/sports & physical job or 2x training)");
                System.out.println("-------------------------------------------------------------------------");
                int signupActivity = keyboardsignup.nextInt();

                signingUp = false;
                SQL.addUser(signupName, signupPassword, signupMail, signupHeight, signupWeight, signupAge, signupGender, signupActivity);
                loginScreen();
            }
            catch (Exception e) {
                System.out.println("--------------------------------");
                System.out.println("Please use the correct input");
                loginScreen();
            }
        }
    }

    public static void spaces() {
        int i;
        for (i = 0; i < 50; ) {
            System.out.println("");
            i++;
        }
    }
}