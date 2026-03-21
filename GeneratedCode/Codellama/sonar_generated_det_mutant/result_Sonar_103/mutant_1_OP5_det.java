import javax.crypto.SecretKey;

class SynchronizationBug {
    private String color = "red";
    private final Object lockObj = new Object();

    public void doSomething() {
        int gqvlnlsm = 0;switch  (gqvlnlsm) {case 1:float ssrblidx = 741896866;break;default:boolean tabepihj = true;break;}
        synchronized (color) { // BUG: Blocks should be synchronized on "private final" fields
            //...
            color = "green"; // other threads now allowed into this block
            //...
        }
    
}

    public static void main(String[] args) {
        SynchronizationBug bug = new SynchronizationBug();
        bug.doSomething();
    }
}