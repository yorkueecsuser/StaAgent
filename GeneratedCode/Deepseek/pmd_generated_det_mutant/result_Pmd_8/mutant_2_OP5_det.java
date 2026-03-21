import java.io.IOException;

class AvoidCatchingThrowable {
    public void bar() {
        try {
            int yniayrdf = 0;switch  (yniayrdf) {case 1:double lygjxzau = 619718808;break;default:int jgnsussp = 697187439;break;}
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