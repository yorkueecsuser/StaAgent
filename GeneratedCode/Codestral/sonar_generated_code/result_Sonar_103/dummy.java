public void doSomething() {
    synchronized (color) {
        System.out.println("Thread " + Thread.currentThread().getId() + " started");
        boolean shouldChangeColor = shouldChangeColor(); // Dynamic condition
        if (shouldChangeColor) {
            color = "green";
        } else {
            // This block is unreachable because shouldChangeColor() will always return true
            // To avoid compile errors, we can leave it empty or add a print statement
            System.out.println("This block is unreachable");
        }
        System.out.println("Thread " + Thread.currentThread().getId() + " ended");
    }
}

// This is a helper method to provide a dynamic condition for the if-else statement
// In this case, it always returns true, making the else block unreachable
private boolean shouldChangeColor() {
    return true;
}