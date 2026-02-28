class AvoidThreadGroupBug {
    public ThreadGroup showBug() {
        ThreadGroup tg = new ThreadGroup("My threadgroup"); // BUG: AvoidThreadGroup
        ThreadGroup a = new ThreadGroup(tg, "my thread group"); // Mutant: Renaming
        ThreadGroup b = Thread.currentThread().getThreadGroup(); // Mutant: Renaming
        return b;
    }
}