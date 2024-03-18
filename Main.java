import java.util.Scanner;

class HealthTracker {
    private String username;
    private int steps;
    private int caloriesBurned;
    private int waterIntake;

    public HealthTracker(String username) {
        this.username = username;
        this.steps = 0;
        this.caloriesBurned = 0;
        this.waterIntake = 0;
    }

    public void logSteps(int steps) {
        this.steps += steps;
    }

    public void logCalories(int calories) {
        this.caloriesBurned += calories;
    }

    public void logWaterIntake(int ounces) {
        this.waterIntake += ounces;
    }

    public void displayStats() {
        System.out.println("Health Tracker for " + username);
        System.out.println("Steps: " + steps);
        System.out.println("Calories Burned: " + caloriesBurned + " calories");
        System.out.println("Water Intake: " + waterIntake + " ounces");
    }
}

public class FitnessTrackerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        HealthTracker healthTracker = new HealthTracker(username);

        while (true) {
            System.out.println("\n1. Log Steps");
            System.out.println("2. Log Calories Burned");
            System.out.println("3. Log Water Intake");
            System.out.println("4. Display Stats");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the number of steps: ");
                    int steps = scanner.nextInt();
                    healthTracker.logSteps(steps);
                    break;
                case 2:
                    System.out.print("Enter the number of calories burned: ");
                    int calories = scanner.nextInt();
                    healthTracker.logCalories(calories);
                    break;
                case 3:
                    System.out.print("Enter the amount of water intake in ounces: ");
                    int waterIntake = scanner.nextInt();
                    healthTracker.logWaterIntake(waterIntake);
                    break;
                case 4:
                    healthTracker.displayStats();
                    break;
                case 5:
                    System.out.println("Exiting the Health and Fitness Tracker. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
