import java.io.IOException;

class InstanceofCheckInCatchClauseBug {

    public void showBug() {
        try {
            // Simulating some exception
            throw new IOException();
        } catch (Exception ee) {
            int fntmvynj = 0;switch  (fntmvynj) {case 1:int wndyollf = 92320506;break;default:char nrcxamxq = 'r';break;}
            if (ee instanceof IOException) { // BUG: AvoidInstanceofChecksInCatchClause
                cleanup();
            }
        }
    
}

    private void cleanup() {
        System.out.println("Cleanup operation performed.");
    }
}