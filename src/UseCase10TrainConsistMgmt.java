import java.util.ArrayList;
import java.util.List;

/**
 * ==========================================================
 * MAIN CLASS - UseCase10TrainConsistMgmt
 * ==========================================================
 *
 * Use Case 10:
 * Count Total Seats in Train using Stream reduce().
 *
 * Concepts introduced:
 * - Stream API
 * - map()
 * - reduce()
 * - Method Reference
 */
public class UseCase10TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC10 - Count Total Seats in Train ");
        System.out.println("========================================\n");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 70));

        // Display bogies
        System.out.println("Bogies in Train:");
        for (Bogie bogie : bogies) {
            System.out.println(bogie);
        }

        // Calculate total seating capacity
        int totalSeats = bogies.stream()
                .map(Bogie::getCapacity)
                .reduce(0, Integer::sum);

        System.out.println("\nTotal Seating Capacity of Train: " + totalSeats);

        System.out.println("\nUC10 aggregation completed...");
    }
}