import java.util.ArrayList;
import java.util.List;

/**
 * ==========================================================
 * MAIN CLASS - UseCase1TrainConsistMgmt
 * ==========================================================
 *
 * Use Case 1:
 * Initialize the Train Consist Management Application.
 *
 * This class is the entry point of the application.
 *
 * At this stage the application:
 * - Displays a welcome message
 * - Creates an empty train consist
 * - Displays the initial bogie count
 * - Prints the current train consist
 *
 * Concepts introduced:
 * - Class
 * - Main Method
 * - List Interface
 * - ArrayList
 * - Console Output
 */
public class UseCase1TrainConsistMgmt {

    public static void main(String[] args) {

        // Display application banner
        System.out.println("========================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("========================================\n");

        // Create an empty dynamic list to store train bogies
        List<String> trainConsist = new ArrayList<>();

        // Display initial train information
        System.out.println("Train initialized successfully...");
        System.out.println("Initial Bogie Count : " + trainConsist.size());
        System.out.println("Current Train Consist : " + trainConsist);

        System.out.println("\nSystem ready for operations...");
    }
}