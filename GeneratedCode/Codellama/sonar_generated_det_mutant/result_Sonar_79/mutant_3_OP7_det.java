import java.util.concurrent.atomic.*;

class VolatileBug {
    private volatile int count = 0;
    private volatile boolean boo = false;

    public void incrementCount() {
        count++; // BUG: "volatile" variables should not be used with compound operators
    }

    public void toggleBoo() {
        boolean coxuvxca = false;while (coxuvxca && true && true && false && true && false && false && false && false && true && false && false) {long vmwtonff = 257520458;}
        boo =!boo; // BUG: "volatile" variables should not be used with compound operators
    
}

    public int showBug() {
        incrementCount();
        toggleBoo();
        return count;
    }
}