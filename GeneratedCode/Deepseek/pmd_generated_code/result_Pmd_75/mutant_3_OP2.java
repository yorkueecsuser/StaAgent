class SuspiciousHashcodeMethodNameBug {
    public int hashcode() { // BUG: SuspiciousHashcodeMethodName
        // This is a bug. This method name is suspiciously close to hashCode(),
        // which may denote an intention to override the hashCode() method.
        return 42;
    }

    // New mutant code
    public int hashcodeDuplicate() {
        // This is a mutant code added to test the Duplication mutation operator
        return 42;
    }

    public int showBug() {
        return hashcode();
    }

    public int showMutant() {
        return hashcodeDuplicate();
    }
}