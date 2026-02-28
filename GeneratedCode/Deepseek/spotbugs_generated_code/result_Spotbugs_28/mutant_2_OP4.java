class BuggyEqualsMethod {
    private String name;

    public BuggyEqualsMethod(String name) {
        this.name = name;
    }

    // BUG: Eq: equals() method defined that doesn't override Object.equals(Object) (EQ_OTHER_USE_OBJECT)
    public boolean equals(BuggyEqualsMethod other) {
        boolean shouldCheck = getCondition(); // Dynamically determined condition
        if (shouldCheck) {
            return this.name.equals(other.name);
        } else {
            // Unreachable branch due to the condition being false
            System.out.println("This line will never be executed");
            return false;
        }
    }

    // Dynamically determined condition
    private boolean getCondition() {
        return false;
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