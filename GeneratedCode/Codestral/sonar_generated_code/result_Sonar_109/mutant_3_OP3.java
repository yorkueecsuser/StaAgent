@Override
public String next() {
    if (!hasNext()) {
        // New unreachable if statement
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // This code will never execute
            throw new RuntimeException("Unreachable code executed");
        }
        return null; // Noncompliant: should throw NoSuchElementException
    }
    return elements.get(position++);
}

private boolean getUnreachableCondition() {
    // This method always returns false, making the if statement unreachable
    return false;
}