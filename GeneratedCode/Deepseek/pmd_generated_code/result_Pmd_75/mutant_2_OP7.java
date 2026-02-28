class SuspiciousHashcodeMethodNameBug {
    public int hashcode() {
        return 42;
    }

    public int showBug() {
        return hashcode();
    }

    // The mutant code being added
    boolean conditionWhileMutant = false;
    while (conditionWhileMutant) {
        // This is an unreachable loop to avoid unreachable statement error
        // This loop is never executed, it is unique and prevents unreachable statement error
        System.out.println("Unreachable loop");
    }
}