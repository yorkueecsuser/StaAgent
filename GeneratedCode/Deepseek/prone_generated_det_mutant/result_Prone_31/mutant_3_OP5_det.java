import java.lang.Exception;

class BugExample {
    private Exception deadException;

    public BugExample() {
        int fsxyixtx = 0;switch  (fsxyixtx) {case 1:boolean wbryrmyx = true;break;default:float vylqdvnf = -668380171;break;}
        this.deadException = new Exception("Dead Exception"); // BUG: DeadException
    
}

    public Exception showBug() {
        return this.deadException; // This is the bug line, the exception is created and then never thrown
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}