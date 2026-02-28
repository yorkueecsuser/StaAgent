class SuspiciousHashcodeMethodNameBug {
    boolean conditionWhile = true; // Mutant Added: Unreachable while loop

    public int hashcode() { // BUG: SuspiciousHashcodeMethodName
        // This is a bug. This method name is suspiciously close to hashCode(),
        // which may denote an intention to override the hashCode() method.
        return 42;
    }

    public int showBug() {
        while (conditionWhile) { // Mutant Added: Unreachable while loop
            conditionWhile = false; // Mutant Added: Unreachable while loop
            break; // Mutant Added: Unreachable while loop
        }
        return hashcode();
    }
}