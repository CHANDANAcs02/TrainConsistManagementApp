/**
 * ==========================================================
 * MAIN CLASS - UseCase14TrainConsistMgmt
 * ==========================================================
 *
 * Use Case 14:
 * Handle Invalid Bogie Capacity using
 * a Custom Exception.
 */
public class UseCase14TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC14 - Handle Invalid Bogie Capacity ");
        System.out.println("========================================\n");

        try {

            Bogie bogie = new Bogie("Sleeper", 72);
            System.out.println("Created Bogie: " + bogie);

            // Invalid Bogie
            Bogie invalid = new Bogie("AC Chair", -20);

            System.out.println(invalid);

        } catch (InvalidCapacityException e) {

            System.out.println("Error: " + e.getMessage());

        }

        System.out.println("\nUC14 exception handling completed...");
    }
}
