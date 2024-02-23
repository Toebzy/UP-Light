package org.example;

import model.entities.User;

import java.util.Scanner;

public class MainMenu {
    public void runMainMenu() {
        SQL SQL = new SQL();
        User currentUser = SQL.getCurrentUser();

        System.out.println("M A I N   M E N U");
        System.out.println("------------------");
        System.out.println("1. Create goal");
        System.out.println("2. Print goal >:3");
        System.out.println("3. Sign out");
        System.out.println("------------------");

        Scanner keyboard = new Scanner(System.in);
        try {
            int intInputMain = keyboard.nextInt();

            if (intInputMain == 1){
                System.out.println("-------------------------------");
                System.out.println("Choose your goal!");
                System.out.println("1. Weight loss ");
                System.out.println("2. Muscle gain ");
                System.out.println("3. Healthy eating habits");
                System.out.println("4. Vegan or vegetarian");
                System.out.println("5. Low-carb");
                System.out.println("6. High-protein");
                System.out.println("-------------------------------");

                int goalChoice = keyboard.nextInt();
                System.out.println("User: "+SQL.getCurrentUser());

                switch (goalChoice) {
                    case 1:
                        System.out.println("You have chosen Weight loss");
                        currentUser.setGoal("Weight loss");
                        break;
                    case 2:
                        System.out.println("You have chosen Muscle gain");
                        currentUser.setGoal("Muscle gain");
                        break;
                    case 3:
                        System.out.println("You have chosen Healthy eating habits");
                        currentUser.setGoal("Healthy eating habits");
                        break;
                    case 4:
                        System.out.println("You have chosen vegetarian diet transition");
                        currentUser.setGoal("Vegetarian");
                        break;
                    case 5:
                        System.out.println("You have chosen Low-carb diet implementation");
                        currentUser.setGoal("Low-carb");
                        break;
                    case 6:
                        System.out.println("You have chosen High-protein diet adoption");
                        currentUser.setGoal("High-protein");
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
                runMainMenu();

            }

            if (intInputMain == 2){
                System.out.println(currentUser.getGoal());
                currentUser.getGoal();
                runMainMenu();
            }

            if (intInputMain == 3){
                Main.loginScreen();
            }

        } catch (Exception e) {
            Main.spaces();
            System.out.println("--------------------------------");
            System.out.println("Please input '1' or '2' instead");
            System.out.println("--------------------------------");
        }
    }
}