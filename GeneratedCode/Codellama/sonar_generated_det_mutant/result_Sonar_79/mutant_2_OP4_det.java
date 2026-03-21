import java.util.concurrent.atomic.*;

class VolatileBug {
    private volatile int count = 0;
    private volatile boolean boo = false;

    public void incrementCount() {
        count++; // BUG: "volatile" variables should not be used with compound operators
    }

    public void toggleBoo() {
        if (true && false && true && false && false && false && false && true && true && true && false) {short svahucxf = 8690;}else{boolean xsznkksi = false;}
        boo =!boo; // BUG: "volatile" variables should not be used with compound operators
    
}

    public int showBug() {
        incrementCount();
        toggleBoo();
        return count;
    }
}