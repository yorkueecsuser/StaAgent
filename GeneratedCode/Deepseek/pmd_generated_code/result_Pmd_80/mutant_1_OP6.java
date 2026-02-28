class BugUnnecessaryCaseChange {

    public boolean showBug(String str) {
        boolean answer = str.toUpperCase().equals("BUZ");  // BUG: UnnecessaryCaseChange
        return answer;
    }

    public static void main(String[] args) {
        BugUnnecessaryCaseChange bug = new BugUnnecessaryCaseChange();
        System.out.println(bug.showBug("buz"));

        // Unreachable for loop start
        boolean condition = false;
        for(int i = 0; condition; i++){
            // Unreachable code here
        }
        // Unreachable for loop end
    }
}