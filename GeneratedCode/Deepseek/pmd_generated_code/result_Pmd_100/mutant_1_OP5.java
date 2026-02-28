import java.util.StringJoiner;

class BugExample {

    public String showBug() {
        StringBuilder sb = new StringBuilder();
        sb.append('a'); // BUG: AppendCharacterWithChar
        int value = 1; // Mutant Code: Add a non-compile-time constant to the switch expression
        switch(value) { // Mutant Code: Add an unreachable switch statement
            case 0:
                System.out.println("Unreachable code");
                break;
            default:
                break;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println(bugExample.showBug());
    }
}