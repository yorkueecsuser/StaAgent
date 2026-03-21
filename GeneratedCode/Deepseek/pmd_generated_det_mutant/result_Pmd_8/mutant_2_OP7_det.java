import java.io.IOException;

class AvoidCatchingThrowable {
    public void bar() {
        try {
            boolean qblpyvsp = false;while (qblpyvsp && false && true && false && false && false && false && true && true && false && true && false) {char etxyxufi = 'n';}
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