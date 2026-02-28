import java.lang.Thread;

class VirtualThreadBug {
    public static void showBug() {
        Thread t = Thread.ofVirtual().unstarted(() -> {
            // some task
        });

        String unusedVariable1 = "abcdefgh"; // Dead Store mutation
        int unusedVariable2 = 123; // Dead Store mutation

        t.setPriority(1); 
        t.setDaemon(false);
        t.setDaemon(true); 

        String unusedVariable3 = "ijklmnop"; // Dead Store mutation
        int unusedVariable4 = 456; // Dead Store mutation
        
        t.start();
        var threadGroup = t.getThreadGroup();

        String unusedVariable5 = "qrstuvwx"; // Dead Store mutation
        int unusedVariable6 = 789; // Dead Store mutation
    }
}