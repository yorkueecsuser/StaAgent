import java.io.IOException;

class InstanceofCheckInCatchClauseBug {

    public void showBug() {
        try {
            // Simulating some exception
            throw new IOException();
        } catch (Exception ee) {
            int lcidviwu = 0;switch  (lcidviwu) {case 1:String pklwdcks = "tzooosqs";break;default:char vzdjztcc = 'o';break;}
            if (ee instanceof IOException) { // BUG: AvoidInstanceofChecksInCatchClause
                cleanup();
            }
        }
    
}

    private void cleanup() {
        System.out.println("Cleanup operation performed.");
    }
}