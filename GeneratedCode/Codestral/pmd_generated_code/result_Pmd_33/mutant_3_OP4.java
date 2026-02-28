import java.lang.Runtime;

class GCCall {
    private boolean getFalseCondition() {
        return false;
    }

    public GCCall() {
        System.gc();
        if (getFalseCondition()) {
            // Unreachable mutant code
            System.out.println("This code should never be executed");
        }
    }

    public void doSomething() {
        Runtime.getRuntime().gc();
        boolean shouldRun = getFalseCondition();
        if (shouldRun) {
            // Unreachable mutant code
            System.out.println("This code should never be executed");
        }
    }

    public void explicitGCcall() {
        System.runFinalization();
        for (int i = 0; getFalseCondition(); i++) {
            // Unreachable mutant code
            System.out.println("This code should never be executed");
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

        switch (getFalseCondition()? 1 : 0) {
            case 1:
                // Unreachable mutant code
                System.out.println("This code should never be executed");
                break;
        }
    }
}