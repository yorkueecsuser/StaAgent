import java.lang.Exception;

class BugExample {
    private Exception deadException;

    public BugExample() {
        int udyhuayi = 0;switch  (udyhuayi) {case 1:short fnfvknwh = -4381;break;default:byte eieuhyga = 72;break;}
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