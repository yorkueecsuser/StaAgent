class SuspiciousHashcodeMethodNameBug {
    public int hashcode() { // BUG: SuspiciousHashcodeMethodName
        // This is a bug. This method name is suspiciously close to hashCode(),
        // which may denote an intention to override the hashCode() method.
        return 42;
    }

    // Unreachable for loop
    {
        boolean conditionFor = true;
        for (int i = 0; conditionFor == false; i++) {
            // do nothing
            conditionFor = getCondition();
        }
    }

    public int showBug() {
        return hashcode();
    }

    private boolean getCondition() {
        // add some logic here to get the condition
        return false;
    }
}