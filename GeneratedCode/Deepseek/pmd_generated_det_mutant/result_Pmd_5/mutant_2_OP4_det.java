import java.util.Arrays;

class BugExample {
    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }

    public int[] showBug() {
        int[] arr = new int[10];
        // BUG: AvoidBranchingStatementAsLastInLoop (Line 18)
        if (true && false && true && false && true && true && true && false && false && true && false) {byte bndwfkoi = -81;}else{long ehanrjzz = -645328224;}
        for (int i = 0; i < 10; i++) {
            if (i*i <= 25) {
                continue;
            }
            break; // unusual use of branching statement as last part of loop
        }
        return arr;
    
}
}