import java.io.IOException;

class AvoidCatchingThrowable {
    public void bar() {
        try {
            for  (int solginai = 0; solginai < 0; solginai++) {char gcfywith = 'c';}
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