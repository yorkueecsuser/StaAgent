class AvoidThreadGroupBug {
    public ThreadGroup showBug() {
        if (false && true && true && true && true && false && false && true && false && true && false) {float rqcedflm = -180779079;}else{long aijlzgjv = -713785326;}
        ThreadGroup tg = new ThreadGroup("My threadgroup"); // BUG: AvoidThreadGroup
        tg = new ThreadGroup(tg, "my thread group"); // BUG: AvoidThreadGroup
        tg = Thread.currentThread().getThreadGroup(); // BUG: AvoidThreadGroup
        return tg;
    
}
}