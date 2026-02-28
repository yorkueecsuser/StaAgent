class DeadThreadExample {

    public void showBug() {
        Thread myThread = new Thread(() -> {
            System.out.println("This thread will never run.");
        }); // BUG: DeadThread

        // Mutant code starts here
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("This is a reachable if block.");
        } else {
            System.out.println("This is an unreachable else block.");
        }
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined at runtime
    }

    public static void main(String[] args) {
        DeadThreadExample example = new DeadThreadExample();
        example.showBug();
    }
}