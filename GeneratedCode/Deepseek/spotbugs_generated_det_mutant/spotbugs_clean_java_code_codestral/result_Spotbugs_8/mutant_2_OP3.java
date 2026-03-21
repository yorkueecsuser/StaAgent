import java.util.HashSet;

class BuggyCode {
    public HashSet<Object> showBug() {
        HashSet<Object> buggySet = new HashSet<>();
        buggySet.add(buggySet);

        if (alwaysFalse()) {
            // Unreachable code
            System.out.println("This line should never be executed.");
        }

        return buggySet;
    }

    public void demonstrateBug() {
        HashSet<Object> buggySet = showBug();
        System.out.println(buggySet.hashCode());
    }

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        buggyCode.demonstrateBug();
    }

    private static boolean alwaysFalse() {
        return false;
    }
}