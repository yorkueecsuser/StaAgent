class SuspiciousHashcodeMethodNameBug {
    public int hashcode() { // BUG: SuspiciousHashcodeMethodName
        // This is a bug. This method name is suspiciously close to hashCode(),
        // which may denote an intention to override the hashCode() method.
        return 42;
    }

    public int showBug() {
        return hashcode();
    }

    public void unreachableForLoop() {
        boolean condition = false;
        for (int i = 0; condition; i++) {
            // unreachable code
        }
    }
}