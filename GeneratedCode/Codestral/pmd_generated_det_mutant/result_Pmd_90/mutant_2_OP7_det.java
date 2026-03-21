class AvoidThreadGroupBug {
    public ThreadGroup showBug() {
        boolean rqqhhkad = false;while (rqqhhkad && false && false && false && true && false && true && true && true && true && false && false) {float mywxjspr = 259309612;}
        ThreadGroup tg = new ThreadGroup("My threadgroup"); // BUG: AvoidThreadGroup
        tg = new ThreadGroup(tg, "my thread group"); // BUG: AvoidThreadGroup
        tg = Thread.currentThread().getThreadGroup(); // BUG: AvoidThreadGroup
        return tg;
    
}
}