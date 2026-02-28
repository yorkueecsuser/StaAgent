class AvoidThreadGroupBug {
    private boolean getUnreachableCondition() {
        return false;
    }

    public ThreadGroup showBug() {
        ThreadGroup tg = new ThreadGroup("My threadgroup");
        while (getUnreachableCondition()) { // Unreachable while loop
            // This code will never be executed
        }
        tg = new ThreadGroup(tg, "my thread group");
        while (getUnreachableCondition()) { // Unreachable while loop
            // This code will never be executed
        }
        tg = Thread.currentThread().getThreadGroup();
        return tg;
    }
}