class LoopBug {
    boolean unreachableCondition = false;

    public int showBug() {
        int i = 0;
        while (i < 1) {
            i++;
            break; // BUG: Loops with at most one iteration should be refactored
        }

        // Unreachable for loop mutation starts here
        for (unreachableCondition = false; unreachableCondition; unreachableCondition = false) {
            System.out.println("Unreachable loop executed!");
        }
        // Unreachable for loop mutation ends here

        return i;
    }

    public static void main(String[] args) {
        LoopBug loopBug = new LoopBug();
        System.out.println(loopBug.showBug());
    }
}