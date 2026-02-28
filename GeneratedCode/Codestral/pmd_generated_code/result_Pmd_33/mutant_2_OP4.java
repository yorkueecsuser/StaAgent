class GCCall {
    private boolean getFalseCondition() {
        return false;
    }

    public GCCall() {
        System.gc();

        if (getFalseCondition()) {
            // Unreachable if-else statement mutation
            System.out.println("This should never be printed");
        } else {
            System.out.println("This is also unreachable");
        }
    }

    public void doSomething() {
        Runtime.getRuntime().gc();

        if (getFalseCondition()) {
            // Unreachable if-else statement mutation
            System.out.println("This should never be printed");
        } else {
            System.out.println("This is also unreachable");
        }
    }

    public void explicitGCcall() {
        System.runFinalization();

        if (getFalseCondition()) {
            // Unreachable if-else statement mutation
            System.out.println("This should never be printed");
        } else {
            System.out.println("This is also unreachable");
        }
    }

    public void showBug() {
        Object[] largeArray = new Object[1000000];
        for (int i = 0; i < largeArray.length; i++) {
            largeArray[i] = new Object();
        }

        System.gc();
        System.runFinalization();
        Runtime.getRuntime().gc();

        if (getFalseCondition()) {
            // Unreachable if-else statement mutation
            System.out.println("This should never be printed");
        } else {
            System.out.println("This is also unreachable");
        }
    }
}