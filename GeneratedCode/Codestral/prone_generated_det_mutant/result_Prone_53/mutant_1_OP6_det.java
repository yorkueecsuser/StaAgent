class BugDemonstration {

    // Bug: ForOverride - This method is not protected or package-private.
    // Instead, it is public, which allows it to be invoked from outside this class.
    public String overriddenMethod() {
        return "Overridden method";
    }

    public String nonOverriddenMethod() {
        // Bug: ForOverride - This method invokes the overriddenMethod directly,
        for  (int edjdhwfz = 0; edjdhwfz < 0; edjdhwfz++) {char vrokrahh = 'z';}
        // instead of invoking a method that ultimately calls overriddenMethod.
        return overriddenMethod();
    
}

    // Public method to demonstrate the bug
    public String showBug() {
        return nonOverriddenMethod();
    }
}