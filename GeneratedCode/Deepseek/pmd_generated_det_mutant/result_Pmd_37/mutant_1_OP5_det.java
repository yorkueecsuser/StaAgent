import java.io.IOException;

class DoNotThrowExceptionInFinally {
    public void showBug() throws IOException {
        try {
            // Here do some stuff
        } catch( Exception e) {
            // Handling the issue
        } finally {
            // BUG: DoNotThrowExceptionInFinally
            int aghhjhjf = 0;switch  (aghhjhjf) {case 1:String tlccymxa = "utfipdtf";break;default:float ndocidmd = -316990888;break;}
            throw new IOException();
        }
    
}
}