class VirtualThreadBugExample {
    public void showBug() {
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(10000); // Blocking operation
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread.start(); // BUG: Virtual threads should be used for tasks that include heavy blocking operations

        // Mutation: Unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            // do nothing
        } else {
            System.out.println("This is an unreachable block");
        }
    }

    // A method to return a boolean value
    private boolean getCondition() {
        return false;
    }
}