import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ==========================================================
 * MAIN CLASS - UseCase11TrainConsistMgmt
 * ==========================================================
 *
 * Use Case 11:
 * Validate Train ID and Cargo Code using Regex.
 *
 * Concepts introduced:
 * - Regular Expressions
 * - Pattern
 * - Matcher
 * - matches()
 */
public class UseCase11TrainConsistMgmt {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println(" UC11 - Validate Train ID & Cargo Codes ");
        System.out.println("========================================\n");

        // Read user input
        System.out.print("Enter Train ID (TRN-1234): ");
        String trainId = sc.nextLine();

        System.out.print("Enter Cargo Code (PET-AB): ");
        String cargoCode = sc.nextLine();

        // Compile regex patterns
        Pattern trainPattern = Pattern.compile("TRN-\\d{4}");
        Pattern cargoPattern = Pattern.compile("PET-[A-Z]{2}");

        // Create matchers
        Matcher trainMatcher = trainPattern.matcher(trainId);
        Matcher cargoMatcher = cargoPattern.matcher(cargoCode);

        // Validate Train ID
        if (trainMatcher.matches()) {
            System.out.println("\nTrain ID is VALID.");
        } else {
            System.out.println("\nTrain ID is INVALID.");
        }

        // Validate Cargo Code
        if (cargoMatcher.matches()) {
            System.out.println("Cargo Code is VALID.");
        } else {
            System.out.println("Cargo Code is INVALID.");
        }

        System.out.println("\nUC11 validation completed...");

        sc.close();
    }
}