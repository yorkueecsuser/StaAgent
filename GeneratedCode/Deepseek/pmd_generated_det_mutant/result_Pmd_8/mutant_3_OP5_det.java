import java.io.IOException;

class AvoidCatchingThrowable {
    public void bar() {
        try {
            int dpmcptjm = 0;switch  (dpmcptjm) {case 1:char cqgnhyqk = 'y';break;default:int fmvinfou = 105058356;break;}
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