class SuspiciousHashcodeMethodNameBug {
    public int hashcode() {
        return 42;
    }

    public int showBug() {
        return hashcode();
    }

    public void unreachableForLoop() {
        boolean condition = getCondition();
        for (int i = 0; condition; i++) {
            // This code will be unreachable because it's inside a loop with a compile-time constant condition
            System.out.println("This will never be executed");
        }
    }
}