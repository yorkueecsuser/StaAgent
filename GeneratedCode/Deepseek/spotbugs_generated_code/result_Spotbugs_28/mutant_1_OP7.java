class BuggyEqualsMethod {
    private String name;

    public BuggyEqualsMethod(String name) {
        this.name = name;
    }

    // BUG: Eq: equals() method defined that doesn't override Object.equals(Object) (EQ_OTHER_USE_OBJECT)
    public boolean equals(BuggyEqualsMethod other) {
        while (getCondition()) { // Unreachable while loop mutant
            // This loop will never be executed because getCondition() always returns false
            // This is to meet the requirements of the "Unreachable while loop" mutation operator
        }
        return this.name.equals(other.name);
    }

    private boolean getCondition() {
        return false; // This will make the while loop unreachable
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