class DeadThreadExample {

    public void showBug() {
        Thread myThread = new Thread(() -> {
            System.out.println("This thread will never run.");
        }); // BUG: DeadThread

        // Inserting an unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because getCondition() always returns false
            System.out.println("This loop will never execute.");
        }
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        DeadThreadExample example = new DeadThreadExample();
        example.showBug();
    }
}