class AlwaysTrueEquals {

    private String name;

    public AlwaysTrueEquals(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        boolean checkEqual = (obj instanceof AlwaysTrueEquals);
        boolean condition = getCondition(); // Ensure the condition is dynamically determined
        if (condition) {
            // This block is unreachable because getCondition() will always return false
            System.out.println("This is an unreachable if block." + checkEqual);
        } else {
            // This block is also unreachable because getCondition() will always return false
            System.out.println("This is reachable block." + this.name);
        }
        return true; // BUG: Eq: equals method always returns true (EQ_ALWAYS_TRUE) 
    }

    @Override
    public int hashCode() {
        // Since equals always returns true, all objects should have the same hash code
        return 42; // Any constant value would work
    }

    private boolean getCondition() {
        // This method always returns false, making the if-else blocks unreachable
        return false;
    }

    public void showBug() {
        AlwaysTrueEquals obj1 = new AlwaysTrueEquals("Alice");
        AlwaysTrueEquals obj2 = new AlwaysTrueEquals("Bob");

        System.out.println("obj1.equals(obj2): " + obj1.equals(obj2));
        System.out.println("obj2.equals(obj1): " + obj2.equals(obj1));
    }

    public static void main(String[] args) {
        AlwaysTrueEquals example = new AlwaysTrueEquals("Example");
        example.showBug();
    }
}