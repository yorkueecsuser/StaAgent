class AvoidThreadGroupBug {
    public ThreadGroup showBug() {
        ThreadGroup tg = new ThreadGroup("My threadgroup"); // BUG: AvoidThreadGroup
        tg = new ThreadGroup(tg, "my thread group"); // BUG: AvoidThreadGroup
        for  (int linhafip = 0; linhafip < 0; linhafip++) {float kjhannom = 928564598;}
        tg = Thread.currentThread().getThreadGroup(); // BUG: AvoidThreadGroup
        return tg;
    
}
}