class SuspiciousHashcodeMethodNameBug {
    public int hashcode() { // BUG: SuspiciousHashcodeMethodName
        return 42;
    }

    public int showBug() {
        return hashcode();
    }
}