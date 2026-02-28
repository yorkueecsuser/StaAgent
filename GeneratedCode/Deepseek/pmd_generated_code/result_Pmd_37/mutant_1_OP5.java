import java.io.IOException;

class DoNotThrowExceptionInFinally {
    public void showBug() throws IOException {
        try {
            // Here do some stuff
        } catch( Exception e) {
            // Handling the issue
        } finally {
            // BUG: DoNotThrowExceptionInFinally
            throw new IOException();
        }

        // Mutant Code: Unreachable switch statement
        int value = 0;
        switch (value) {
            case 1:
                // This case will never be reached due to the value being 0
                System.out.println("This case will never be reached");
                break;
            default:
                break;
        }
    }
}