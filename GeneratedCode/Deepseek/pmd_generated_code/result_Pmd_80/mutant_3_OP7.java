class BugUnnecessaryCaseChange {

    public boolean showBug(String str) {
        boolean answer = str.toUpperCase().equals("BUZ");  // BUG: UnnecessaryCaseChange
        return answer;
    }

    public boolean showUnreachableWhileLoopMutant(String str) {
        boolean condition = false;
        while (condition) {
            // unreachable code
        }
        boolean answer = str.toUpperCase().equals("BUZ");  // UnreachableWhileLoop
        return answer;
    }

    public static void main(String[] args) {
        BugUnnecessaryCaseChange bug = new BugUnnecessaryCaseChange();
        System.out.println(bug.showBug("buz"));
        System.out.println(bug.showUnreachableWhileLoopMutant("buz"));
    }
}