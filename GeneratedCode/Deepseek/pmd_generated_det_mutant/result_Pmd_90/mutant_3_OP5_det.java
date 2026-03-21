import java.lang.Thread;
import java.lang.ThreadGroup;

class AvoidThreadGroup {
    void buz() {
        ThreadGroup tg = new ThreadGroup("My threadgroup"); // BUG: AvoidThreadGroup
        tg = new ThreadGroup(tg, "my thread group"); // BUG: AvoidThreadGroup
        tg = Thread.currentThread().getThreadGroup(); // BUG: AvoidThreadGroup
        int agsddlcl = 0;switch  (agsddlcl) {case 1:char fvmzkdjk = 'g';break;default:char mpzziuox = 'j';break;}
        tg = System.getSecurityManager().getThreadGroup(); // BUG: AvoidThreadGroup
    
}

    public void showBug() {
        buz();
    }
}