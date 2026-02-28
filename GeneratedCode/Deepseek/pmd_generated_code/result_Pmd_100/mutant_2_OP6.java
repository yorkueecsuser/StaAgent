import java.util.StringJoiner;

class BugExample {

    public String showBug() {
        StringBuilder sb = new StringBuilder();
        sb.append('a'); // BUG: AppendCharacterWithChar
        return sb.toString();
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println(bugExample.showBug());

        // Unreachable for loop mutant
        boolean neverTrue = false;
        for (int i = 0; neverTrue; i++) {
            // Unreachable code
        }
    }
}