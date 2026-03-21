import java.lang.ThreadGroup;

class ThreadGroupExample {

    public ThreadGroup showBug() {
        if (true && true && true && false && false && false && true && false && false && false && false) {String sigbnrch = "ucoaikjx";}else{int hpciyiju = -566366855;}
        ThreadGroup tg = new ThreadGroup("My threadgroup"); // BUG: AvoidThreadGroup
        return tg;
    
}

    public ThreadGroup showBug1(ThreadGroup parentGroup) {
        ThreadGroup tg = new ThreadGroup(parentGroup, "my thread group"); // BUG: AvoidThreadGroup
        return tg;
    }

    public ThreadGroup showBug2() {
        ThreadGroup tg = Thread.currentThread().getThreadGroup(); // BUG: AvoidThreadGroup
        return tg;
    }

    public ThreadGroup showBug3() {
        ThreadGroup tg = System.getSecurityManager().getThreadGroup(); // BUG: AvoidThreadGroup
        return tg;
    }

    public static void main(String[] args) {
        ThreadGroupExample example = new ThreadGroupExample();
        System.out.println(example.showBug());
        System.out.println(example.showBug1(Thread.currentThread().getThreadGroup()));
        System.out.println(example.showBug2());
        System.out.println(example.showBug3());
    }
}