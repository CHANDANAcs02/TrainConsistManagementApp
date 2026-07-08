import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * ==========================================================
 * MAIN CLASS - UseCase8TrainConsistMgmt
 * ==========================================================
 *
 * Use Case 8:
 * Filter Passenger Bogies Using Streams.
 *
 * This class demonstrates how the Stream API
 * filters passenger bogies based on seating capacity.
 *
 * Concepts introduced:
 * - Stream API
 * - stream()
 * - filter()
 * - Lambda Expressions
 * - collect(Collectors.toList())
 */
public class UseCase8TrainConsistMgmt {

    public static void main(String[] args) {

        // Display application banner
        System.out.println("========================================");
        System.out.println(" UC8 - Filter Passenger Bogies Using Streams ");
        System.out.println("========================================\n");

        // Create a list of passenger bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));

        // Display all bogies
        System.out.println("All Bogies:");
        for (Bogie bogie : bogies) {
            System.out.println(bogie);
        }

        // Filter bogies with capacity greater than 60
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());

        // Display filtered bogies
        System.out.println("\nFiltered Bogies (Capacity > 60):");
        for (Bogie bogie : filteredBogies) {
            System.out.println(bogie);
        }

        System.out.println("\nUC8 filtering completed...");
    }
}