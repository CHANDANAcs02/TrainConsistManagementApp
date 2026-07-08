/**
 * Represents a goods bogie with type and cargo.
 */
public class GoodsBogie {

    private String type;
    private String cargo;

    public GoodsBogie(String type) {
        this.type = type;
    }

    public void assignCargo(String cargo) {

        if (type.equals("Rectangular") &&
                cargo.equals("Petroleum")) {

            throw new CargoSafetyException(
                    "Unsafe cargo assignment!");
        }

        this.cargo = cargo;

        System.out.println("Cargo assigned successfully -> " + cargo);
    }

    public String getType() {
        return type;
    }
}