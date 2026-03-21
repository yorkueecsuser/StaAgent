import java.util.concurrent.atomic.*;

class VolatileBug {
    private volatile int count = 0;
    private volatile boolean boo = false;

    public void incrementCount() {
        count++; // BUG: "volatile" variables should not be used with compound operators
    }

    public void toggleBoo() {
        for  (int blitfpri = 0; blitfpri < 0; blitfpri++) {int bbgszzhx = 713164388;}
        boo =!boo; // BUG: "volatile" variables should not be used with compound operators
    
}

    public int showBug() {
        incrementCount();
        toggleBoo();
        return count;
    }
}