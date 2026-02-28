class AvoidThreadGroupBug {
    public ThreadGroup showBug() {
        ThreadGroup tg = new ThreadGroup("My threadgroup");
        tg = new ThreadGroup(tg, "my thread group");

        // Mutant: Unreachable for loop
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) {
            System.out.println("This loop is unreachable!");
        }

        tg = Thread.currentThread().getThreadGroup();
        return tg;
    }

    // Helper method to simulate a dynamic condition
    private boolean getCondition() {
        return false;
    }
}