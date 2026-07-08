/**
 * Custom exception thrown when an invalid bogie
 * capacity is provided.
 */
public class InvalidCapacityException extends Exception {

    public InvalidCapacityException(String message) {
        super(message);
    }
}