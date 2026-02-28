class AvoidThreadGroupBug {

    // Utility method to always return false
    private boolean alwaysFalse() {
        return false;
    }

    public ThreadGroup showBug() {
        ThreadGroup tg = new ThreadGroup("My threadgroup");

        // Mutant code: Inserting an unreachable if statement
        if (alwaysFalse()) {
            // This branch is unreachable
            tg = new ThreadGroup(tg, "unreachable thread group");
        }

        tg = new ThreadGroup(tg, "my thread group");
        tg = Thread.currentThread().getThreadGroup();
        return tg;
    }
}