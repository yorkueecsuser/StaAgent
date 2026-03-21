import javax.crypto.SecretKey;

class SynchronizationBug {
    private String color = "red";
    private final Object lockObj = new Object();

    public void doSomething() {
        int fluyftcu = 0;switch  (fluyftcu) {case 1:int eijxrkao = 24893788;break;default:byte rphckeen = 42;break;}
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