class LoopBug {

    public int showBug() {
        int x = 0;
        while (x < 1) {
            x++;
            break; // BUG: Loops with at most one iteration should be refactored
        }
        return x;
    }

    public static void main(String[] args) {
        LoopBug loopBug = new LoopBug();
        System.out.println(loopBug.showBug());
    }
}