package model.entities;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testCalorieCalculationForManSedentary() {
        User user = new User("John", "test", "john@mail.com", 180, 80, 30, "M", 1);
        Calculator calculator = new Calculator();
        double expectedCalories = (10 * 80 + 6.25 * 180 - 5 * 30 + 5) * 1.2;
        assertEquals(expectedCalories, calculator.calculateCalories(user));
    }

    @Test
    public void testCalorieCalculationForWomanModeratelyActive() {
        User user = new User("Alice", "test", "alice@mail.com", 160, 60, 25, "F", 3);
        Calculator calculator = new Calculator();
        double expectedCalories = (10 * 60 + 6.25 * 160 - 5 * 25 - 161) * 1.55;
        assertEquals(expectedCalories, calculator.calculateCalories(user));
    }
}