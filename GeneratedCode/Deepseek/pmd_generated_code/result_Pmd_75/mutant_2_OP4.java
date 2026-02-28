class SuspiciousHashcodeMethodNameBug {
    public int hashcode() {
        return 42;
    }

    public int showBug() {
        boolean condition = false;
        if (condition) {
            return hashcode();
        } else {
            return 0;
        }
    }
}