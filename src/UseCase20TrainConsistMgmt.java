import java.util.ArrayList;
import java.util.List;

/**
 * ==========================================================
 * MAIN CLASS - UseCase20TrainConsistMgmt
 * ==========================================================
 *
 * Use Case 20:
 * Exception Handling During Search Operations.
 *
 * Concepts:
 * - IllegalStateException
 * - Defensive Programming
 * - Fail-Fast Principle
 */
public class UseCase20TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC20 - Exception Handling During Search ");
        System.out.println("========================================\n");

        List<String> bogies = new ArrayList<>();

        // Fail-fast validation
        if (bogies.isEmpty()) {
            throw new IllegalStateException(
                    "No bogies available in train. Cannot perform search.");
        }

        // This line will never execute
        System.out.println("Searching bogies...");
    }
}