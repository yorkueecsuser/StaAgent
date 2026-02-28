import java.util.StringJoiner;

class BugExample {

    public String showBug() {
        StringBuilder sb = new StringBuilder();
        sb.append('a'); // BUG: AppendCharacterWithChar
        boolean condition = getCondition();
        if (condition == false) {
            for (int i = 0; i < 1; i++) {
                // Infinite Loop
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println(bugExample.showBug());
    }

    public boolean getCondition() {
        return false;
    }
}