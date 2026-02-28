class Example {
    private int id;
    private String name;

    public Example(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Example example = (Example) o;
        return id == example.id && name.equals(example.name);
    }

    // BUG: OverrideBothEqualsAndHashcode
    // hashCode method is missing

    public void showBug() {
        Example obj1 = new Example(1, "Example");
        Example obj2 = new Example(1, "Example");

        boolean isEqual = obj1.equals(obj2);
        int obj1Hash = obj1.hashCode(); // This will use Object's hashCode
        int obj2Hash = obj2.hashCode(); // This will use Object's hashCode

        System.out.println("Objects are equal: " + isEqual);
        System.out.println("Object 1 hash code: " + obj1Hash);
        System.out.println("Object 2 hash code: " + obj2Hash);

        // Unreachable if-else statement mutation
        boolean condition = getUnreachableCondition(); // Dynamic condition
        if (condition) {
            System.out.println("This will never be printed.");
        } else {
            System.out.println("This is the reachable else branch.");
        }
    }

    private boolean getUnreachableCondition() {
        return false; // Always returns false but dynamically evaluated
    }

    public static void main(String[] args) {
        Example example = new Example(1, "Example");
        example.showBug();
    }
}