class SuspiciousHashcodeMethodNameBug {
    public int hashcode() { // BUG: SuspiciousHashcodeMethodName
        // This is a bug. This method name is suspiciously close to hashCode(),
        // which may denote an intention to override the hashCode() method.
        return 42;
    }

    private boolean getCondition() {
        return false;
    }

    public int showBug() {
        boolean condition = getCondition(); 
        if (condition) {
            return hashcode();
        } else {
            return 0;
        }
    }
}