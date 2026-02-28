class UnreachableCodeBug {
    public int showBug(boolean a, boolean b) {
        int result = 0;
        boolean condition = false;
        if (!a || b) { // Noncompliant; "!a" is always "true", "b" is never evaluated
            for (int i = 0; condition; i++) { // Unreachable for loop
                System.out.println("This is an unreachable for loop");
            }
            result = 1;
        } else {
            result = 2; // never executed
        }
        return result;
    }
}