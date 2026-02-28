class GCCall {
    public GCCall() {
        System.gc();
    }

    public void doSomething() {
        boolean isUnreachable = false;
        switch (isUnreachable? 1 : 0) {
            case 1:
                // This code is unreachable
                System.out.println("Unreachable code executed!");
                break;
            default:
                // Original code
                Runtime.getRuntime().gc();
        }
    }

    // Rest of the code remains unchanged
    //...
}