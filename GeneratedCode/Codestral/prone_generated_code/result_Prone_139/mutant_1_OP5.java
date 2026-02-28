public int showBug(Foo foo) {
    int barNameFieldNumber = foo.getBarNameFieldNumber(); // Existing code

    boolean shouldRun = getConditionThatAlwaysReturnsFalse(); // Added code
    if (shouldRun) { // This condition will always evaluate to false
        switch (barNameFieldNumber) { // Unreachable switch statement
            case 1:
                // This case will never be reached
                break;
            default:
                // This code will also be unreachable
                break;
        }
    }

    return barNameFieldNumber;
}

private boolean getConditionThatAlwaysReturnsFalse() {
    return false; // This method always returns false
}