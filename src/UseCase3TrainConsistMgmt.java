import java.util.HashSet;
import java.util.Set;

/**
 * ==========================================================
 * MAIN CLASS - UseCase3TrainConsistMgmt
 * ==========================================================
 *
 * Use Case 3:
 * Track Unique Bogie IDs
 *
 * Description:
 * This class demonstrates how HashSet automatically
 * prevents duplicate bogie IDs from being added.
 *
 * At this stage the application:
 * - Stores bogie IDs
 * - Prevents duplicate IDs
 * - Displays unique bogie identifiers
 *
 * Concepts introduced:
 * - Set Interface
 * - HashSet
 * - add()
 * - Automatic duplicate removal
 */
public class UseCase3TrainConsistMgmt {

    public static void main(String[] args) {

        // Display application banner
        System.out.println("========================================");
        System.out.println(" UC3 - Track Unique Bogie IDs ");
        System.out.println("========================================\n");

        // Create a HashSet to store unique bogie IDs
        Set<String> bogies = new HashSet<>();

        // ---------------- ADD BOGIE IDs ----------------
        // Duplicate IDs will automatically be ignored
        bogies.add("BG101");
        bogies.add("BG102");
        bogies.add("BG103");
        bogies.add("BG104");

        // Duplicate entries
        bogies.add("BG101");
        bogies.add("BG102");

        // Display all unique bogie IDs
        System.out.println("Bogie IDs After Insertion:");
        System.out.println(bogies);

        System.out.println("\nNote:");
        System.out.println("Duplicates are automatically ignored by HashSet.");

        System.out.println("\nUC3 uniqueness validation completed...");
    }
}