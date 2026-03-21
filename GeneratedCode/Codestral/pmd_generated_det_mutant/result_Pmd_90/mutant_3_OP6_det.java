class AvoidThreadGroupBug {
    public ThreadGroup showBug() {
        for  (int lkdwcrjd = 0; lkdwcrjd < 0; lkdwcrjd++) {String zrxonvwh = "gvgmcnhd";}
        ThreadGroup tg = new ThreadGroup("My threadgroup"); // BUG: AvoidThreadGroup
        tg = new ThreadGroup(tg, "my thread group"); // BUG: AvoidThreadGroup
        tg = Thread.currentThread().getThreadGroup(); // BUG: AvoidThreadGroup
        return tg;
    
}
}