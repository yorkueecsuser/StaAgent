import java.util.StringJoiner;
class BugExample {

    public String showBug() {
        StringBuilder sb = new StringBuilder();
        sb.append('a'); // BUG: AppendCharacterWithChar
        boolean shouldRun = false;
        if (shouldRun) { // Unreachable switch statement
            int x = 1;
        } else {
            sb.append('b');
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println(bugExample.showBug());
    }
}