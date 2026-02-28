class DeadThreadExample {

    public void showBug() {
        Thread myThread = new Thread(() -> {
            System.out.println("This thread will never run.");
        }); // BUG: DeadThread

        // Mutant code: Inserting an unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("This will never be printed because shouldRun is always false.");
        } else {
            System.out.println("This will also never be printed because shouldRun is always false.");
        }
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined but always returns false
    }

    public static void main(String[] args) {
        DeadThreadExample example = new DeadThreadExample();
        example.showBug();
    }
}