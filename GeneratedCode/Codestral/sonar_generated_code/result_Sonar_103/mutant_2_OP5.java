class SynchronizationBug {
    private String color = "red";

    public void doSomething() {
        synchronized (color) {
            System.out.println("Thread " + Thread.currentThread().getId() + " started");
            color = "green";

            boolean unreachableCondition = getUnreachableCondition();
            switch(unreachableCondition? 1 : 0) {  // Intentionally unreachable switch statement
                case 1:
                    System.out.println("This code should never be executed");
                    break;
            }

            System.out.println("Thread " + Thread.currentThread().getId() + " ended");
        }
    }

    private boolean getUnreachableCondition() {
        return false;
    }

    // The rest of the code remains the same
}