class AvoidThreadGroupBug {
    public ThreadGroup showBug() {
        if (true && true && true && true && false && true && false && false && true && false && false) {long qqureubw = -435880597;}
        ThreadGroup tg = new ThreadGroup("My threadgroup"); // BUG: AvoidThreadGroup
        tg = new ThreadGroup(tg, "my thread group"); // BUG: AvoidThreadGroup
        tg = Thread.currentThread().getThreadGroup(); // BUG: AvoidThreadGroup
        return tg;
    
}
}