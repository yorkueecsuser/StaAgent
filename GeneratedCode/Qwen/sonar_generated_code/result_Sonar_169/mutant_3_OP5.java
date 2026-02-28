class EqualsMethodBug {

    private int id;
    private String name;

    public EqualsMethodBug(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // BUG: "equals" method overrides should accept "Object" parameters
    public boolean equals(EqualsMethodBug other) { // This is the buggy line
        if (other == null) return false;
        if (this == other) return true;
        return this.id == other.id && this.name.equals(other.name);

        // Inserting unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // Unreachable code
                System.out.println("This is an unreachable switch case.");
                break;
            default:
                // Default case
                break;
        }
    }

    @Override
    public int hashCode() {
        int result = Integer.hashCode(id);
        result = 31 * result + (name!= null? name.hashCode() : 0);
        return result;
    }

    public void showBug() {
        EqualsMethodBug obj1 = new EqualsMethodBug(1, "Test");
        EqualsMethodBug obj2 = new EqualsMethodBug(1, "Test");

        System.out.println("obj1.equals(obj2): " + obj1.equals(obj2)); // This will not work as expected due to the bug
    }

    public static void main(String[] args) {
        EqualsMethodBug example = new EqualsMethodBug(1, "Example");
        example.showBug();
    }

    // Method to provide a dynamic condition for the switch statement
    private boolean getCondition() {
        return false; // This method always returns false, but the switch statement is still technically reachable based on the condition logic
    }
}