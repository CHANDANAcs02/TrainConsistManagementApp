import java.util.LinkedHashSet;

/**
 * ==========================================================
 * MAIN CLASS - UseCase5TrainConsistMgmt
 * ==========================================================
 *
 * Use Case 5:
 * Preserve Insertion Order of Bogies
 *
 * This class demonstrates how LinkedHashSet maintains
 * insertion order while preventing duplicate bogies.
 *
 * Concepts introduced:
 * - LinkedHashSet
 * - Set
 * - add()
 * - Automatic duplicate removal
 * - Insertion order preservation
 */
public class UseCase5TrainConsistMgmt {

    public static void main(String[] args) {

        // Display application banner
        System.out.println("========================================");
        System.out.println(" UC5 - Preserve Insertion Order of Bogies ");
        System.out.println("========================================\n");

        // Create a LinkedHashSet to store bogies
        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

        // Add bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt to add duplicate bogie
        trainFormation.add("Sleeper");

        // Display final train formation
        System.out.println("Final Train Formation:");
        System.out.println(trainFormation);

        System.out.println("\nNote:");
        System.out.println("LinkedHashSet preserves insertion order and removes duplicates automatically.");

        System.out.println("\nUC5 formation setup completed...");
    }
}