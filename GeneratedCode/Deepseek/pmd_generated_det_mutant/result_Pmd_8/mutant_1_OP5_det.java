import java.io.IOException;

class AvoidCatchingThrowable {
    public void bar() {
        try {
            int fcfyqqyv = 0;switch  (fcfyqqyv) {case 1:String crcywpws = "nngbwdlj";break;default:long pfqpkqdq = 462580391;break;}
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