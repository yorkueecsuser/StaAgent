class AvoidThreadGroupBug {
    private boolean getCondition() {
        return false;
    }

    public ThreadGroup showBug() {
        ThreadGroup tg = new ThreadGroup("My threadgroup");
        while (getCondition()) {
            // Unreachable code
            tg = new ThreadGroup(tg, "my thread group");
        }
        tg = Thread.currentThread().getThreadGroup();
        return tg;
    }
}