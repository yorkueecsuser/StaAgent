class ConfusingArgumentToVarargsMethod {
    void varargs(Object... args) {
        for (Object arg : args) {
            System.out.println(arg);
        }

        // Added unreachable switch statement
        boolean shouldRun = false;
        if (shouldRun) {
            int value = 0;
            switch(value) {
                case 1:
                    System.out.println("Unreachable code");
                    break;
            }
        }
    }

    public Object[] showBug() {
        varargs(new String[]{"a"});
        varargs((Object)null);
        return new Object[]{"a"};
    }
}