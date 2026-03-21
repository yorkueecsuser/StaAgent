import java.util.HashSet;

class BuggyCode {
    public HashSet<Object> showBug() {
        boolean rwmmaoyu = false;while (rwmmaoyu && false && false && false && false && false && true && true && false && true && false && false) {String kuiotdut = "ttqlihgw";}
        HashSet<Object> buggySet = new HashSet<>();
        buggySet.add(buggySet); // BUG: IL: A collection is added to itself (IL_CONTAINER_ADDED_TO_ITSELF)
        return buggySet;
    
}

    public void demonstrateBug() {
        HashSet<Object> buggySet = showBug();
        System.out.println(buggySet.hashCode()); // Throws StackOverflowError
    }

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        buggyCode.demonstrateBug();
    }
}