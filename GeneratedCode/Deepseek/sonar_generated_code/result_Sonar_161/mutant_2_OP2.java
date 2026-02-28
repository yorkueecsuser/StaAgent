class LoopBug {

    public int showBug() {
        int i = 0;
        int j = 0; // new variable to duplicate assignment statement
        while (i < 1) {
            i++;
            j++; // new duplicate assignment statement
            break; // BUG: Loops with at most one iteration should be refactored
        }
        return i;
    }

    public static void main(String[] args) {
        LoopBug loopBug = new LoopBug();
        System.out.println(loopBug.showBug());
    }
}