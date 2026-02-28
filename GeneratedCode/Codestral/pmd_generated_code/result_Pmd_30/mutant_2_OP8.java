class ConfusingArgumentToVarargsMethod {
    void varargs(Object... args) {
        for (Object arg : args) {
            System.out.println(arg);
        }
    }

    public Object[] showBug() {
        Object[] objs = new String[]{"a"};
        varargs(objs);
        Object objNull = null;
        varargs(objNull);
        return new Object[]{"a"};
    }
}