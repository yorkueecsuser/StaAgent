class ConfusingArgumentToVarargsMethod {
    void varargs(Object... args) {
        for (Object arg : args) {
            System.out.println(arg);
        }
    }

    public Object[] showBug() {
        varargs(new String[]{"a"});
        varargs((Object)null);

        // MUTANT CODE
        boolean unreachableCondition = false;
        int value = 1;
        if (unreachableCondition) {
            switch (value) {
                case 2:
                    System.out.println("This code will never be executed.");
                    break;
                default:
                    break;
            }
        }

        return new Object[]{"a"};
    }
}