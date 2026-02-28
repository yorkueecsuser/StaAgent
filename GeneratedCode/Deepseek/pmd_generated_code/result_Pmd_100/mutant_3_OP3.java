import java.util.StringJoiner;

class BugExample {

    private boolean alwaysFalse = false;
    private int alwaysZero = 0;

    public String showBug() {
        StringBuilder sb = new StringBuilder();
        sb.append('a'); // BUG: AppendCharacterWithChar

        if (alwaysFalse) {
            // Unreachable code
            sb.append('b');
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println(bugExample.showBug());
    }
}