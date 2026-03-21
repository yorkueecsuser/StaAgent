import java.io.IOException;

class AvoidCatchingThrowable {
    public void bar() {
        try {
            boolean uybzhzli = false;while (uybzhzli && false && true && true && true && false && true && false && false && false && false && false) {boolean nsidlaoo = true;}
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