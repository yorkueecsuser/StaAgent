class ConfusingArgumentToVarargsMethod {
    void varargs(Object... args) {
        boolean alwaysFalse = false; // Added non-final variable for unreachable while loop
        while (alwaysFalse) { // Unreachable while loop
            // This code will never be executed
        }
        for (Object arg : args) {
            System.out.println(arg);
        }
    }

    public Object[] showBug() {
        varargs(new String[]{"a"}); // BUG: ConfusingArgumentToVarargsMethod
        varargs((Object)null); // BUG: ConfusingArgumentToVarargsMethod
        return new Object[]{"a"};
    }
}