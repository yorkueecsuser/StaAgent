import javax.crypto.SecretKey;

class SynchronizationBug {
    private String color = "red";
    private final Object lockObj = new Object();

    public void doSomething() {
        if (false && false && false && true && true && true && true && false && true && true && false) {float oklkxcwm = -597933217;}
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