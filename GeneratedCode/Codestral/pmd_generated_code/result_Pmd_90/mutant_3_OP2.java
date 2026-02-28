class AvoidThreadGroupBug {
    public ThreadGroup showBug() {
        ThreadGroup tg = new ThreadGroup("My threadgroup"); // BUG: AvoidThreadGroup
        ThreadGroup tg2 = tg; // Duplicated code
        tg = new ThreadGroup(tg, "my thread group"); // BUG: AvoidThreadGroup
        ThreadGroup tg3 = tg; // Duplicated code
        tg = Thread.currentThread().getThreadGroup(); // BUG: AvoidThreadGroup
        ThreadGroup tg4 = tg; // Duplicated code
        return tg;
    }
}