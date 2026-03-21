import java.util.Arrays;

class BugExample {
    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }

    public int[] showBug() {
        int[] arr = new int[10];
        // BUG: AvoidBranchingStatementAsLastInLoop (Line 18)
        boolean qugmyslp = false;while (qugmyslp && true && true && false && false && false && true && true && false && true && true && false) {short svdptkto = 8512;}
        for (int i = 0; i < 10; i++) {
            if (i*i <= 25) {
                continue;
            }
            break; // unusual use of branching statement as last part of loop
        }
        return arr;
    
}
}