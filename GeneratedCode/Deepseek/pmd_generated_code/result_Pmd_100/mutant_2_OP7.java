import java.util.StringJoiner;

class BugExample {

    public String showBug() {
        StringBuilder sb = new StringBuilder();
        sb.append('a');
        boolean conditionWhile = getCondition(); 
        while (conditionWhile) { 
            // This code is unreachable due to the while loop condition always being false
            System.out.println("Unreachable code"); 
        }
        return sb.toString();
    }

    public boolean getCondition() {
        return false; // This ensures the while loop condition is always false
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println(bugExample.showBug());
    }
}