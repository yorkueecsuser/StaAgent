class BugDemonstration {

    public String overriddenMethod() {
        return "Overridden method";
    }

    public String nonOverriddenMethod() {
        String message = overriddenMethod();

        // Mutation Operator: Duplication
        // Duplicating the assignment statement and insert immediately after its current location
        String duplicatedMessage = message;

        return message;
    }

    public String showBug() {
        return nonOverriddenMethod();
    }
}