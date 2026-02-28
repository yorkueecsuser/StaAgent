class BugUnnecessaryCaseChange {

    public boolean showBug(String str) {
        boolean answer = str.toUpperCase().equals("BUZ");  // BUG: UnnecessaryCaseChange
        return answer;
    }

    public static void main(String[] args) {
        BugUnnecessaryCaseChange bug = new BugUnnecessaryCaseChange();
        System.out.println(bug.showBug("buz"));

        // Mutant code
        int mutantLoopCounter = 0;
        boolean mutantCondition = false;
        for (int i = 0; mutantCondition; i++) {
            mutantLoopCounter++;
            if (mutantLoopCounter >= 10000000) { 
                mutantCondition = true; 
            }
        }
    }
}