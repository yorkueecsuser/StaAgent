import javax.crypto.SecretKey;

class SynchronizationBug {
    private String color = "red";
    private final Object lockObj = new Object();

    public void doSomething() {
        int rsedgzxe = 0;switch  (rsedgzxe) {case 1:long urnibimf = 41255728;break;default:String wkhbhlcr = "uholosje";break;}
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