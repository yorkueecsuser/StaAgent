class SuspiciousHashcodeMethodNameBug {
    public int hashcode() { // BUG: SuspiciousHashcodeMethodName
        // This is a bug. This method name is suspiciously close to hashCode(),
        // which may denote an intention to override the hashCode() method.
        switch (new java.util.Random().nextInt()) { // Unreachable switch statement
            default:
                break;
        }
        return 42;
    }

    public int showBug() {
        return hashcode();
    }
}