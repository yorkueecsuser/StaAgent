class DeadThreadExample {

    public void showBug() {
        Thread myThread = new Thread(() -> {
            System.out.println("This thread will never run.");
        }); // BUG: DeadThread

        // Inserting an unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is always false
                System.out.println("Unreachable case 0");
                break;
            case 1:
                // This case is reachable
                System.out.println("Reachable case 1");
                break;
        }
    }

    private boolean getCondition() {
        return false; // This method always returns false, ensuring the switch is mostly unreachable
    }

    public static void main(String[] args) {
        DeadThreadExample example = new DeadThreadExample();
        example.showBug();
    }
}