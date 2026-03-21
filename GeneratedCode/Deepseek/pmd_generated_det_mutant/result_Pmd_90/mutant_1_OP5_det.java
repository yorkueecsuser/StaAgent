import java.lang.Thread;
import java.lang.ThreadGroup;

class AvoidThreadGroup {
    void buz() {
        int lbfqslfz = 0;switch  (lbfqslfz) {case 1:String cdkizgki = "tdtcbtgt";break;default:int tybmwxyw = 476276614;break;}
        ThreadGroup tg = new ThreadGroup("My threadgroup"); // BUG: AvoidThreadGroup
        tg = new ThreadGroup(tg, "my thread group"); // BUG: AvoidThreadGroup
        tg = Thread.currentThread().getThreadGroup(); // BUG: AvoidThreadGroup
        tg = System.getSecurityManager().getThreadGroup(); // BUG: AvoidThreadGroup
    
}

    public void showBug() {
        buz();
    }
}