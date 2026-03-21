import java.io.IOException;

class DoNotThrowExceptionInFinally {
    public void showBug() throws IOException {
        try {
            // Here do some stuff
        } catch( Exception e) {
            // Handling the issue
        } finally {
            // BUG: DoNotThrowExceptionInFinally
            int ygprsztc = 0;switch  (ygprsztc) {case 1:double jtsyttxi = 8708666;break;default:boolean nrfdtjhi = true;break;}
            throw new IOException();
        }
    
}
}