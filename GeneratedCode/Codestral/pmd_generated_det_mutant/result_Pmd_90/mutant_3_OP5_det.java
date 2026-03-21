class AvoidThreadGroupBug {
    public ThreadGroup showBug() {
        int mhgyjvmc = 0;switch  (mhgyjvmc) {case 1:float xvsmdnyz = -168904491;break;default:char moviuuxj = 'i';break;}
        ThreadGroup tg = new ThreadGroup("My threadgroup"); // BUG: AvoidThreadGroup
        tg = new ThreadGroup(tg, "my thread group"); // BUG: AvoidThreadGroup
        tg = Thread.currentThread().getThreadGroup(); // BUG: AvoidThreadGroup
        return tg;
    
}
}