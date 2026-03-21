import java.io.IOException;

class AvoidCatchingThrowable {
    public void bar() {
        try {
            if (true && true && true && true && false && false && true && true && true && true && false) {short tbcqrnjn = -2245;}else{short pzxtpthw = 2430;}
            throw new OutOfMemoryError("Out of memory"); // BUG: AvoidCatchingThrowable
        } catch (Throwable th) {
            th.printStackTrace();
        }
    
}

    public void showBug() {
        try {
            bar(); // This line of code will cause an OutOfMemoryError
        } catch (Throwable th) {
            System.out.println(th.getMessage() + " - This is expected behavior");
        }
    }
}