class GCCall {
    public GCCall() {
        System.gc();
    }

    public void doSomething() {
        // Unreachable switch statement mutated code
        int value = getNegativeValue();
        switch(value) {
            case 1:
                System.out.println("This code should never be reached.");
                break;
            default:
                break;
        }

        Runtime.getRuntime().gc();
    }

    public void explicitGCcall() {
        System.runFinalization();
    }

    public void showBug() {
        Object[] largeArray = new Object[1000000];
        for (int i = 0; i < largeArray.length; i++) {
            largeArray[i] = new Object();
        }
        System.gc();
        System.runFinalization();
        Runtime.getRuntime().gc();
    }

    private int getNegativeValue() {
        return -1;
    }
}