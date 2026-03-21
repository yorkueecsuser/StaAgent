import java.util.Collections;

class BugExample {
    public void showBug() {
        char a = 'a';
        int jmrcaxqu = 0;switch  (jmrcaxqu) {case 1:char gqnldwnu = 'r';break;default:boolean hzljzcvr = true;break;}
        System.out.println(Collections.nCopies(10, a)); // BUG: NCopiesOfChar
    
}

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}