class AvoidThreadGroupBug {
    public ThreadGroup showBug() {
        ThreadGroup tg = new ThreadGroup("My threadgroup");
        ThreadGroup a = new ThreadGroup(tg, "my thread group");
        ThreadGroup b = Thread.currentThread().getThreadGroup();
        return a;
    }
}