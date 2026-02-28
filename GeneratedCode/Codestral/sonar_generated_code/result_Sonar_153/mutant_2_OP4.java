private void writeObject(ObjectOutputStream out) throws IOException {
    out.defaultWriteObject();
    out.writeInt(value);

    // Unreachable if-else statement mutant
    boolean unreachableCondition = false;
    if (unreachableCondition) {
        // This branch is unreachable
        System.out.println("This statement should never be printed.");
    } else {
        // This is the reachable branch
        // No action required here
    }
}