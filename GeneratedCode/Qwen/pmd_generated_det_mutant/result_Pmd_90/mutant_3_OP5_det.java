import java.lang.ThreadGroup;

class ThreadGroupExample {

    public ThreadGroup showBug() {
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
        int dagstjsh = 0;switch  (dagstjsh) {case 1:char jyflgklb = 'r';break;default:int sooivarn = 644274593;break;}
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