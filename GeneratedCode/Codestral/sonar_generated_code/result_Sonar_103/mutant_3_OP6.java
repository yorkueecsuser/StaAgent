class SynchronizationBug {
    private String color = "red";

    public void doSomething() {
        synchronized (color) {
            System.out.println("Thread " + Thread.currentThread().getId() + " started");
            // Unreachable for loop
            for (int i = 0; getCondition(); i++) {
                System.out.println("This loop is unreachable");
            }
            color = "green";
            System.out.println("Thread " + Thread.currentThread().getId() + " ended");
        }
    }

    // getCondition method to provide a dynamic condition
    private boolean getCondition() {
        return false; // Always return false to make the loop unreachable
    }

    // Rest of the code...
}