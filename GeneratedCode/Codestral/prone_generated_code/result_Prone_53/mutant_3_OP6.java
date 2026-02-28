class BugDemonstration {

    // Bug: ForOverride - This method is not protected or package-private.
    // Instead, it is public, which allows it to be invoked from outside this class.
    public String overriddenMethod() {
        return "Overridden method";
    }

    public String nonOverriddenMethod() {
        // Inserted unreachable for loop
        boolean condition = falseCondition();
        for (int i = 0; condition; i++) {
            // Unreachable code
            System.out.println("Unreachable code");
        }

        // Bug: ForOverride - This method invokes the overriddenMethod directly,
        // instead of invoking a method that ultimately calls overriddenMethod.
        return overriddenMethod();
    }

    // Public method to demonstrate the bug
    public String showBug() {
        return nonOverriddenMethod();
    }

    // Method that always returns false
    private boolean falseCondition() {
        return false;
    }
}