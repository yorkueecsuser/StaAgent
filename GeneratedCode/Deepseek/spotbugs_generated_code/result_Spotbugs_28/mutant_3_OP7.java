class BuggyEqualsMethod {
    private String name;

    public BuggyEqualsMethod(String name) {
        this.name = name;
    }

    public boolean equals(BuggyEqualsMethod other) {
        if (other!= null) { // Added null check to avoid NullPointerException
            boolean conditionWhile = false; // Condition for the unreachable while loop
            while (conditionWhile) { // Unreachable while loop
                System.out.println("This line should not be executed.");
            }
            return this.name.equals(other.name);
        }
        return false; // Return false if other is null
    }

    public void showBug() {
        BuggyEqualsMethod obj1 = new BuggyEqualsMethod("Object");
        Object obj2 = new BuggyEqualsMethod("Object");

        System.out.println("Using equals(Object): " + obj1.equals(obj2)); // Should print false, but prints true due to bug
        System.out.println("Using equals(BuggyEqualsMethod): " + obj1.equals(new BuggyEqualsMethod("Object"))); // Should print true
    }

    public static void main(String[] args) {
        BuggyEqualsMethod buggyObj = new BuggyEqualsMethod("");
        buggyObj.showBug();
    }
}