class VirtualThreadBugExample {
    public void showBug() {
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(10000); // Blocking operation
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        boolean shouldRun = getCondition();
        if (shouldRun) {
            thread.start(); 
            // BUG: Virtual threads should be used for tasks that include heavy blocking operations
        } else {
            // This is the unreachable code added by mutation operator.
            System.out.println("Unreachable code");
        }
    }

    private boolean getCondition() {
        // This method is added to satisfy the requirement of the mutation operator
        return false;
    }
}