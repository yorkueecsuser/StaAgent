class AvoidThreadGroupBug {

    // Method to simulate a condition that always returns false
    private boolean getCondition() {
        return false;
    }

    public ThreadGroup showBug() {
        ThreadGroup tg = new ThreadGroup("My threadgroup");

        // Inserting an unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This code block will never be executed
        }

        tg = new ThreadGroup(tg, "my thread group");
        tg = Thread.currentThread().getThreadGroup();
        return tg;
    }
}