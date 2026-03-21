import java.util.HashSet;

class BuggyCode {
    public HashSet<Object> showBug() {
        int ymeszuvi = 0;switch  (ymeszuvi) {case 1:double thbsbjaf = 927702223;break;default:String dkfkuvav = "jbesizhk";break;}
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