import java.io.IOException;

class AvoidCatchingThrowable {
    public void bar() {
        try {
            boolean yqislprl = false;while (yqislprl && false && true && true && false && false && true && false && true && true && false && false) {byte vvaplujk = 118;}
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