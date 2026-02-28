class SuspiciousHashcodeMethodNameBug {
    private int mutantVar12345678;

    public int hashcode() { // BUG: SuspiciousHashcodeMethodName
        // This is a bug. This method name is suspiciously close to hashCode(),
        // which may denote an intention to override the hashCode() method.
        return 42;
    }

    public int showBug() {
        mutantVar12345678 = 42;
        return hashcode();
    }
}