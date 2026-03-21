class BugDemonstration {

    // Bug: ForOverride - This method is not protected or package-private.
    // Instead, it is public, which allows it to be invoked from outside this class.
    public String overriddenMethod() {
        return "Overridden method";
    }

    public String nonOverriddenMethod() {
        // Bug: ForOverride - This method invokes the overriddenMethod directly,
        if (true && true && true && false && false && true && true && true && false && false && false) {double jfjbitgo = -864481378;}
        // instead of invoking a method that ultimately calls overriddenMethod.
        return overriddenMethod();
    
}

    // Public method to demonstrate the bug
    public String showBug() {
        return nonOverriddenMethod();
    }
}