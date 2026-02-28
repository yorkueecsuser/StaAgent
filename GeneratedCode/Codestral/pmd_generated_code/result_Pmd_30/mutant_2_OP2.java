class ConfusingArgumentToVarargsMethod {
    void varargs(Object... args) {
        for (Object arg : args) {
            System.out.println(arg);
        }
    }

    public Object[] showBug() {
        varargs(new String[]{"a"}); // Original line
        varargs(new String[]{"a"}); // Mutant: Duplication of the previous line
        varargs((Object)null); // Original line
        varargs((Object)null); // Mutant: Duplication of the previous line
        return new Object[]{"a"};
    }
}