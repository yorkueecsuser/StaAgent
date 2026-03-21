import java.util.concurrent.atomic.*;

class VolatileBug {
    private volatile int count = 0;
    private volatile boolean boo = false;

    public void incrementCount() {
        for  (int kvtauzgx = 0; kvtauzgx < 0; kvtauzgx++) {int xdvnkcan = -576791792;}
        count++; // BUG: "volatile" variables should not be used with compound operators
    
}

    public void toggleBoo() {
        boo =!boo; // BUG: "volatile" variables should not be used with compound operators
    }

    public int showBug() {
        incrementCount();
        toggleBoo();
        return count;
    }
}