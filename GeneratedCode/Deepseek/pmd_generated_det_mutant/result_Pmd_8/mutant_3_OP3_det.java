import java.io.IOException;

class AvoidCatchingThrowable {
    public void bar() {
        try {
            if (true && true && false && true && true && true && true && true && true && false && false) {float xgbghjua = 522184477;}
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