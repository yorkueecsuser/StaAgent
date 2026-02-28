class Foo {
    private Foo() {}
    void foo() {}
    // BUG: MissingStaticMethodInNonInstantiatableClass

    public static void showBug() {
        Foo f = new Foo(); // This will throw a compilation error
        // 'Foo()' has private access in 'Foo'
    }

    public static void mutant() {
        boolean shouldRun = false;
        if (shouldRun) {
            System.out.println("This is an unreachable if statement");
        } else {
            System.out.println("This statement should never be executed");
        }

        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) {
            System.out.println("This is an unreachable for loop");
        }

        boolean conditionWhile = false;
        while (conditionWhile) {
            System.out.println("This is an unreachable while loop");
        }

        int value = 0;
        switch(value) {
            case 1:
                System.out.println("This is an unreachable switch case");
                break;
            default:
                System.out.println("This statement should never be executed");
                break;
        }

        boolean condition = false;
        if (condition) {
            System.out.println("This is an unreachable if-else statement");
        } else {
            System.out.println("This statement should never be executed");
        }
    }
}