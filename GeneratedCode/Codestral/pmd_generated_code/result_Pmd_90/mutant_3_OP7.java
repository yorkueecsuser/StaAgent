class AvoidThreadGroupBug {
    private boolean getFalseCondition() {
        // This method always returns false
        return false;
    }

    public ThreadGroup showBug() {
        ThreadGroup tg = new ThreadGroup("My threadgroup");
        tg = new ThreadGroup(tg, "my thread group");

        // Unreachable while loop inserted here
        while (getFalseCondition()) {
            // This code is unreachable
        }

        tg = Thread.currentThread().getThreadGroup();
        return tg;
    }
}