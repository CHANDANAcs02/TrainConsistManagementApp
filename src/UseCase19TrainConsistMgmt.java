/**
 * ==========================================================
 * MAIN CLASS - UseCase19TrainConsistMgmt
 * ==========================================================
 *
 * Use Case 19:
 * Binary Search for Bogie ID.
 *
 * Concepts:
 * - Binary Search
 * - compareTo()
 * - Divide and Conquer
 * - Sorted Arrays
 */
public class UseCase19TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("==================================================");
        System.out.println(" UC19 - Binary Search for Bogie ID ");
        System.out.println("==================================================\n");

        String[] bogieIds = {
                "BG101",
                "BG205",
                "BG309",
                "BG412",
                "BG550"
        };

        String searchId = "BG309";

        System.out.println("Sorted Bogie IDs:\n");

        for (String id : bogieIds) {
            System.out.println(id);
        }

        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        while (low <= high) {

            int mid = (low + high) / 2;

            int result = searchId.compareTo(bogieIds[mid]);

            if (result == 0) {
                found = true;
                break;
            } else if (result < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        System.out.println();

        if (found) {
            System.out.println("Bogie " + searchId + " found using Binary Search.");
        } else {
            System.out.println("Bogie " + searchId + " not found.");
        }

        System.out.println("\nUC19 search completed...");
    }
}