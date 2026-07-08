/**
 * ==========================================================
 * MAIN CLASS - UseCase15TrainConsistMgmt
 * ==========================================================
 *
 * Use Case 15:
 * Safe Cargo Assignment using try-catch-finally.
 */
public class UseCase15TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("==================================================");
        System.out.println(" UC15 - Safe Cargo Assignment ");
        System.out.println("==================================================\n");

        GoodsBogie cylindrical = new GoodsBogie("Cylindrical");

        try {

            cylindrical.assignCargo("Petroleum");

        } catch (CargoSafetyException e) {

            System.out.println("Error: " + e.getMessage());

        } finally {

            System.out.println("Cargo validation completed for Cylindrical bogie");
        }

        System.out.println();

        GoodsBogie rectangular = new GoodsBogie("Rectangular");

        try {

            rectangular.assignCargo("Petroleum");

        } catch (CargoSafetyException e) {

            System.out.println("Error: " + e.getMessage());

        } finally {

            System.out.println("Cargo validation completed for Rectangular bogie");
        }

        System.out.println("\nUC15 runtime handling completed...");
    }
}