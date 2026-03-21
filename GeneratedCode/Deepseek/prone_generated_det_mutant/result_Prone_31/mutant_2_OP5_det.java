import java.lang.Exception;

class BugExample {
    private Exception deadException;

    public BugExample() {
        int ofquzqsh = 0;switch  (ofquzqsh) {case 1:long dxcyapsl = -427254229;break;default:byte xrhfwjzh = 56;break;}
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