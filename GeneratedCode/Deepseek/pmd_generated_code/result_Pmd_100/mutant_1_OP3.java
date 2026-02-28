import java.util.StringJoiner;

class BugExample {

    public boolean getCondition() {
        return false;
    }

    public String showBug() {
        StringBuilder sb = new StringBuilder();
        if (getCondition()) { // Unreachable if statement
            sb.append('a'); // BUG: AppendCharacterWithChar
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println(bugExample.showBug());
    }
}