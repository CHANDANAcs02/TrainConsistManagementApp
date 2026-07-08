import java.util.ArrayList;
import java.util.List;

/**
 * ==========================================================
 * MAIN CLASS - UseCase12TrainConsistMgmt
 * ==========================================================
 *
 * Use Case 12:
 * Safety Compliance Check for Goods Bogies.
 *
 * Concepts:
 * - Stream API
 * - allMatch()
 * - Lambda Expressions
 * - Business Rule Validation
 */
public class UseCase12TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("==================================================");
        System.out.println(" UC12 - Safety Compliance Check for Goods Bogies ");
        System.out.println("==================================================\n");

        List<GoodsBogie> goodsBogies = new ArrayList<>();

        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Open", "Coal"));
        goodsBogies.add(new GoodsBogie("Box", "Grain"));
        goodsBogies.add(new GoodsBogie("Cylindrical", "Coal"));

        System.out.println("Goods Bogies in Train:");

        for (GoodsBogie bogie : goodsBogies) {
            System.out.println(bogie);
        }

        // Safety Rule:
        // Cylindrical bogies can carry only Petroleum
        boolean safe = goodsBogies.stream()
                .allMatch(b ->
                        !b.getType().equals("Cylindrical")
                                || b.getCargo().equals("Petroleum"));

        System.out.println("\nSafety Compliance Status: " + safe);

        if (safe) {
            System.out.println("Train formation is SAFE.");
        } else {
            System.out.println("Train formation is NOT SAFE.");
        }

        System.out.println("\nUC12 safety validation completed...");
    }
}