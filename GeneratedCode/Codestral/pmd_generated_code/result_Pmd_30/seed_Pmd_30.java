class ConfusingArgumentToVarargsMethod {
    void varargs(Object... args) {
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