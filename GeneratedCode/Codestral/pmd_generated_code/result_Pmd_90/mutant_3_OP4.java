class AvoidThreadGroupBug {
    private boolean getCondition() {
        return false;  // Always return false to make the branch unreachable
    }

    public ThreadGroup showBug() {
        ThreadGroup tg = new ThreadGroup("My threadgroup");
        tg = new ThreadGroup(tg, "my thread group");

        if(getCondition()) {
            // Unreachable branch
            tg = null;
        } else {
            // Original code continues here
            tg = Thread.currentThread().getThreadGroup();
        }

        return tg;
    }
}