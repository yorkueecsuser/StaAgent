class LoopBug {

    public int showBug() {
        int i = 0;
        while (i < 1) {
            i++;
            break; // Original Bug: Loops with at most one iteration should be refactored
        }
        
        // Mutant: Unreachable while loop
        boolean condition = getCondition(); // Mutant variable
        while (condition) { // Always true condition
            break; // Unreachable code
        }
        
        return i;
    }

    public boolean getCondition() {
        return true; // Always returns true
    }

    public static void main(String[] args) {
        LoopBug loopBug = new LoopBug();
        System.out.println(loopBug.showBug());
    }
}