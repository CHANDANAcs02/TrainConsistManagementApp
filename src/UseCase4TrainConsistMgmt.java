import java.util.LinkedList;

/**
 * ==========================================================
 * MAIN CLASS - UseCase4TrainConsistMgmt
 * ==========================================================
 *
 * Use Case 4:
 * Maintain Ordered Train Consist using LinkedList.
 *
 * This class demonstrates how LinkedList preserves the
 * order of bogies and allows insertion and removal from
 * both ends of the train.
 *
 * Concepts introduced:
 * - LinkedList
 * - add()
 * - add(index, element)
 * - removeFirst()
 * - removeLast()
 * - Ordered collection
 */
public class UseCase4TrainConsistMgmt {

    public static void main(String[] args) {

        // Display application banner
        System.out.println("========================================");
        System.out.println(" UC4 - Maintain Ordered Train Consist ");
        System.out.println("========================================\n");

        // Create a LinkedList to store train bogies
        LinkedList<String> trainConsist = new LinkedList<>();

        // Add bogies to the train
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC Chair");
        trainConsist.add("Goods");
        trainConsist.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(trainConsist);

        // Insert Pantry Car at index 2
        trainConsist.add(2, "Pantry Car");

        System.out.println("\nAfter Adding Pantry Car:");
        System.out.println(trainConsist);

        // Remove the first bogie
        trainConsist.removeFirst();

        // Remove the last bogie
        trainConsist.removeLast();

        System.out.println("\nAfter Removing First and Last Bogies:");
        System.out.println(trainConsist);

        System.out.println("\nUC4 operations completed successfully...");
    }
}