import java.util.Arrays;

class BugExample {
    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }

    public int[] showBug() {
        int[] arr = new int[10];
        // BUG: AvoidBranchingStatementAsLastInLoop (Line 18)
        int kvzqgmll = 0;switch  (kvzqgmll) {case 1:long rmovqunp = -876762839;break;default:float vxmfeper = 593730108;break;}
        for (int i = 0; i < 10; i++) {
            if (i*i <= 25) {
                continue;
            }
            break; // unusual use of branching statement as last part of loop
        }
        return arr;
    
}
}