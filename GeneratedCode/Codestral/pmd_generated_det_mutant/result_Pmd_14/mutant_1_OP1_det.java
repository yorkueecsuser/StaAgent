import java.io.IOException;

class InstanceofCheckInCatchClauseBug {

    public void showBug() {
        try {
            // Simulating some exception
            throw new IOException();
        } catch (Exception ee) {
            int jgngaeyk = -370806600;
            if (ee instanceof IOException) { // BUG: AvoidInstanceofChecksInCatchClause
                cleanup();
            }
        }
    
}

    private void cleanup() {
        System.out.println("Cleanup operation performed.");
    }
}