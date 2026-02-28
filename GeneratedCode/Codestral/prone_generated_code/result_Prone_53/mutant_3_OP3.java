class BugDemonstration {

    // Bug: ForOverride - This method is not protected or package-private.
    // Instead, it is public, which allows it to be invoked from outside this class.
    public String overriddenMethod() {
        // Added unreachable if statement
        if (getFalseCondition()) {
            System.out.println("This is an unreachable statement");
        }
        return "Overridden method";
    }

    public String nonOverriddenMethod() {
        // Bug: ForOverride - This method invokes the overriddenMethod directly,
        // instead of invoking a method that ultimately calls overriddenMethod.
        return overriddenMethod();
    }

    // Public method to demonstrate the bug
    public String showBug() {
        return nonOverriddenMethod();
    }

    // Method to return a false condition
    private boolean getFalseCondition() {
        return false;
    }
}