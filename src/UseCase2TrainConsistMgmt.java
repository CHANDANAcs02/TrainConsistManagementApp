import java.util.ArrayList;
import java.util.List;

/**
 * ==========================================================
 * MAIN CLASS - UseCase2TrainConsistMgmt
 * ==========================================================
 *
 * Use Case 2:
 * Add Passenger Bogies to the Train.
 *
 * This class demonstrates how passenger bogies can be
 * managed dynamically using ArrayList operations.
 *
 * At this stage the application:
 * - Adds new passenger bogies
 * - Removes an existing bogie
 * - Checks whether a bogie exists
 * - Displays the final train consist
 *
 * Concepts introduced:
 * - ArrayList
 * - add()
 * - remove()
 * - contains()
 * - CRUD operations
 */
public class UseCase2TrainConsistMgmt {

    public static void main(String[] args) {

        // Display application banner
        System.out.println("========================================");
        System.out.println(" UC2 - Add Passenger Bogies to Train ");
        System.out.println("========================================\n");

        // Create an ArrayList to store passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // ---------------- CREATE ----------------
        // Add passenger bogies to the train
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("After Adding Bogies:");
        System.out.println("Passenger Bogies : " + passengerBogies);

        // ---------------- DELETE ----------------
        // Remove one bogie from the train
        passengerBogies.remove("AC Chair");

        System.out.println("\nAfter Removing 'AC Chair':");
        System.out.println("Passenger Bogies : " + passengerBogies);

        // ---------------- READ ----------------
        // Check if Sleeper bogie exists
        System.out.println("\nChecking if 'Sleeper' exists:");
        System.out.println("Contains Sleeper? : " +
                passengerBogies.contains("Sleeper"));

        // Display the final train consist
        System.out.println("\nFinal Train Passenger Consist:");
        System.out.println(passengerBogies);

        System.out.println("\nUC2 operations completed successfully...");
    }
}