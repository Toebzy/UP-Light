package model.entities;

public class Calculator {


    public double calculateCalories(User user) {
        double bmr;

        if (user.getGender().equalsIgnoreCase("M")) {
            bmr = 10 * user.getWeight() + 6.25 * user.getHeight() - 5 * user.getAge() + 5;
        } else {
            bmr = 10 * user.getWeight() + 6.25 * user.getHeight() - 5 * user.getAge() - 161;
        }

        double activityFactor;
        switch (user.getActivity()) {
            case 1:
                activityFactor = 1.2;
                break;
            case 2:
                activityFactor = 1.375;
                break;
            case 3:
                activityFactor = 1.55;
                break;
            case 4:
                activityFactor = 1.725;
                break;
            case 5:
                activityFactor = 1.9;
                break;
            default:
                throw new IllegalArgumentException("Invalid activity level");
        }

        return bmr * activityFactor;
    }
}