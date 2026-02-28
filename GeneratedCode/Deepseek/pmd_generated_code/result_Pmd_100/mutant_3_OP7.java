import java.util.StringJoiner;

class BugExample {

    private boolean condition = false; // Mutation: Added private boolean field

    public String showBug() {
        StringBuilder sb = new StringBuilder();
        sb.append('a'); // BUG: AppendCharacterWithChar
        // Mutation: Added unreachable while loop
        while (condition) {
            System.out.println("Unreachable code");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println(bugExample.showBug());
    }
}