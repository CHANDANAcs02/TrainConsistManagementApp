import java.util.HashMap;
import java.util.Map;

/**
 * ==========================================================
 * MAIN CLASS - UseCase6TrainConsistMgmt
 * ==========================================================
 *
 * Use Case 6:
 * Map Bogie to Capacity using HashMap.
 *
 * This class demonstrates how HashMap stores
 * bogie names as keys and their capacities as values.
 *
 * Concepts introduced:
 * - Map Interface
 * - HashMap
 * - put()
 * - entrySet()
 * - Key-Value Mapping
 */
public class UseCase6TrainConsistMgmt {

    public static void main(String[] args) {

        // Display application banner
        System.out.println("========================================");
        System.out.println(" UC6 - Map Bogie to Capacity (HashMap) ");
        System.out.println("========================================\n");

        // Create a HashMap to store bogie capacities
        Map<String, Integer> bogieCapacity = new HashMap<>();

        // Add bogie names and capacities
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 56);
        bogieCapacity.put("First Class", 24);
        bogieCapacity.put("Cargo", 120);

        // Display all bogie capacity details
        System.out.println("Bogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\nUC6 bogie-capacity mapping completed...");
    }
}