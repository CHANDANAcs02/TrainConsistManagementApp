/**
 * Represents a passenger bogie.
 * Stores the bogie name and seating capacity.
 */
public class Bogie {

    private String name;
    private int capacity;

    // Constructor
    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Returns bogie name
    public String getName() {
        return name;
    }

    // Returns seating capacity
    public int getCapacity() {
        return capacity;
    }

    // Displays bogie details
    @Override
    public String toString() {
        return name + " -> " + capacity;
    }
}