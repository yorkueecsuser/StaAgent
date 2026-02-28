class AvoidThreadGroupBug {
    public ThreadGroup showBug() {
        ThreadGroup tg = new ThreadGroup("My threadgroup"); // BUG: AvoidThreadGroup
        tg = new ThreadGroup("My threadgroup"); // Mutant: Duplicated statement
        tg = new ThreadGroup(tg, "my thread group"); // BUG: AvoidThreadGroup
        tg = new ThreadGroup(tg, "my thread group"); // Mutant: Duplicated statement
        tg = Thread.currentThread().getThreadGroup(); // BUG: AvoidThreadGroup
        tg = Thread.currentThread().getThreadGroup(); // Mutant: Duplicated statement
        return tg;
    }
}