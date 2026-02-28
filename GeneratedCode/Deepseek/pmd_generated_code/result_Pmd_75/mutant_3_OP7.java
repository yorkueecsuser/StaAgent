class SuspiciousHashcodeMethodNameBug {
    private boolean condition = true; // new mutated variable

    public int hashcode() {
        int i = 0; // new local variable
        while (i < 1) { // new unreachable while loop, always false
            i++;
        }
        return 42;
    }

    public int showBug() {
        return hashcode();
    }
}