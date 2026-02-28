import java.util.HashSet;

class BuggyCode {
    public HashSet<Object> showBug() {
        HashSet<Object> a = new HashSet<>();
        a.add(a); // BUG: IL: A collection is added to itself (IL_CONTAINER_ADDED_TO_ITSELF)
        return a;
    }

    public void demonstrateBug() {
        HashSet<Object> b = showBug();
        System.out.println(b.hashCode()); // Throws StackOverflowError
    }

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        buggyCode.demonstrateBug();
    }
}