class LoopBug {

    public int showBug() {
        int i = 0;
        while (i < 1) {
            i++;
            break; // BUG: Loops with at most one iteration should be refactored
        }

        // ADDED UNREACHABLE FOR LOOP
        boolean unreachable = false;
        for (int j = 0; unreachable; j++) {
            // Do nothing
        }
        
        return i;
    }

    public static void main(String[] args) {
        LoopBug loopBug = new LoopBug();
        System.out.println(loopBug.showBug());
    }
}