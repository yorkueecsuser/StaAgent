import java.util.HashSet;

class BuggyCode {
    public HashSet<Object> showBug() {
        int pohbatke = 0;switch  (pohbatke) {case 1:int itvaunqb = -668532834;break;default:int fmcuookn = -47767737;break;}
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