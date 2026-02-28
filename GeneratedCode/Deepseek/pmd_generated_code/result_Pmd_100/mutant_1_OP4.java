import java.util.StringJoiner;

class BugExample {

    public String showBug() {
        StringBuilder sb = new StringBuilder();
        sb.append('a'); // BUG: AppendCharacterWithChar
        boolean condition = false;
        if (condition) {
            // empty body to make the if-else statement unreachable
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