class BugUnnecessaryCaseChange {

    public boolean showBug(String str) {
        boolean answer = str.toUpperCase().equals("BUZ");  // BUG: UnnecessaryCaseChange
        return answer;
    }

    public static void main(String[] args) {
        BugUnnecessaryCaseChange bug = new BugUnnecessaryCaseChange();
        System.out.println(bug.showBug("buz"));

        // Mutation: Unreachable While Loop
        boolean condition = true;
        while (condition) {
            System.out.println("Unreachable code inside unreachable while loop");
        }
    }
}