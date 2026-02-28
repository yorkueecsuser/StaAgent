class ConfusingArgumentToVarargsMethod {
    void varargs(Object... args) {
        // Inserted unreachable for loop
        boolean condition = false;
        for (int i = 0; condition; i++) {
            System.out.println("This line will never be executed");
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