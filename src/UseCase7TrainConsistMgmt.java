import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * ==========================================================
 * MAIN CLASS - UseCase7TrainConsistMgmt
 * ==========================================================
 *
 * Use Case 7:
 * Sort Bogies by Capacity using Comparator.
 *
 * Concepts introduced:
 * - Custom Objects
 * - List
 * - Comparator
 * - Lambda Expression
 * - sort()
 */
public class UseCase7TrainConsistMgmt {

    public static void main(String[] args) {

        // Display application banner
        System.out.println("========================================");
        System.out.println(" UC7 - Sort Bogies by Capacity (Comparator) ");
        System.out.println("========================================\n");

        // Create a list to store bogies
        List<Bogie> bogies = new ArrayList<>();

        // Add passenger bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));

        // Display bogies before sorting
        System.out.println("Before Sorting:");
        for (Bogie bogie : bogies) {
            System.out.println(bogie);
        }

        // Sort bogies by seating capacity
        bogies.sort(Comparator.comparingInt(Bogie::getCapacity));

        // Display bogies after sorting
        System.out.println("\nAfter Sorting by Capacity:");
        for (Bogie bogie : bogies) {
            System.out.println(bogie);
        }

        System.out.println("\nUC7 sorting completed...");
    }
}