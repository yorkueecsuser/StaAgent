class AvoidThreadGroupBug {
    public ThreadGroup showBug() {
        int deadStore; // Added Dead Store variable
        ThreadGroup tg = new ThreadGroup("My threadgroup");
        deadStore = 10; // Assigning a value to the dead store variable
        tg = new ThreadGroup(tg, "my thread group");
        deadStore = 20; // Assigning another value to the dead store variable
        tg = Thread.currentThread().getThreadGroup();
        return tg;
    }
}