class DeadThreadExample {

    public void showBug() {
        Thread myThread = new Thread(() -> {
            System.out.println("This thread will never run.");
        }); // BUG: DeadThread

        // Inserting unreachable switch statement
        boolean alwaysFalse = getCondition();
        switch (alwaysFalse) {
            case true:
                System.out.println("This case is unreachable.");
                break;
            default:
                System.out.println("This default case is also unreachable.");
                break;
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