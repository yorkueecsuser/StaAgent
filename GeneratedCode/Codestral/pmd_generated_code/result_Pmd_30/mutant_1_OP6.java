class ConfusingArgumentToVarargsMethod {
    private boolean getFalseCondition() {
        return false; // return a dynamically determined false condition
    }

    void varargs(Object... args) {
        // insert an unreachable for loop here
        for (int i = 0; getFalseCondition(); i++) { // mutant code
            System.out.println("This line is unreachable.");
        }
        for (Object arg : args) {
            System.out.println(arg);
        }
    }

    public Object[] showBug() {
        varargs(new String[]{"a"});
        varargs((Object)null);
        return new Object[]{"a"};
    }
}