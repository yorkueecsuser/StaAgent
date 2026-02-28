class BugDemonstration {

    // Bug: ForOverride - This method is not protected or package-private.
    // Instead, it is public, which allows it to be invoked from outside this class.
    public String overriddenMethod() {
        return "Overridden method";
    }

    public String nonOverriddenMethod() {
        // Bug: ForOverride - This method invokes the overriddenMethod directly,
        // instead of invoking a method that ultimately calls overriddenMethod.
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // This block is unreachable as getUnreachableCondition() always returns false
            System.out.println("This line should never be executed");
        }
        return overriddenMethod();
    }

    // Public method to demonstrate the bug
    public String showBug() {
        return nonOverriddenMethod();
    }

    private boolean getUnreachableCondition() {
        // This method always returns false to make the if statement unreachable
        return false;
    }
}