class ConfusingArgumentToVarargsMethod {
    void varargs(Object... args) {
        for (Object arg : args) {
            System.out.println(arg);
        }
    }

    public Object[] showBug() {
        varargs(new String[]{"a"});

        boolean condition = false; // Added non-final variable to avoid unreachable statement error
        if (condition) { // Added to ensure the switch statement is unreachable
            int value = 0; // Added non-final variable to avoid unreachable statement error in switch
            switch (value) { // Unreachable switch statement
                case 1:
                    System.out.println("Unreachable code");
                    break;
            }
        }

        varargs((Object)null);
        return new Object[]{"a"};
    }
}