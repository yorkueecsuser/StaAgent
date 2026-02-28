class AvoidThreadGroupBug {
    public ThreadGroup showBug() {
        ThreadGroup tg = new ThreadGroup("My threadgroup"); // BUG: AvoidThreadGroup
        ThreadGroup yg = new ThreadGroup(tg, "my thread group"); // Mutated: Renamed tg to yg
        yg = Thread.currentThread().getThreadGroup(); // BUG: AvoidThreadGroup
        return yg;
    }
}