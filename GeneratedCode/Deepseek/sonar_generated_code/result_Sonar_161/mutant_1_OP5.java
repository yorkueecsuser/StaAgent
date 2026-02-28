class LoopBug {

    public int showBug() {
        int i = 0;
        boolean condition = (i < 1);
        while (condition) {
            i++;
            break; // BUG: Loops with at most one iteration should be refactored
        }
        return i;
    }

    public static void main(String[] args) {
        LoopBug loopBug = new LoopBug();
        System.out.println(loopBug.showBug());
    }
}