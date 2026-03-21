import java.lang.ThreadGroup;

class ThreadGroupExample {

    public ThreadGroup showBug() {
        ThreadGroup tg = new ThreadGroup("My threadgroup"); // BUG: AvoidThreadGroup
        return tg;
    }
public ThreadGroup showBug1(ThreadGroup parentGroup){
    ThreadGroup tg = new ThreadGroup(parentGroup , "my thread group");
    tg = new ThreadGroup(parentGroup , "my thread group");
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