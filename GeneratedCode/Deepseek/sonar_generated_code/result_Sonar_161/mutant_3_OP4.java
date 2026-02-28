class LoopBug {
    private boolean condition = true;

    public int showBug() {
        int i = 0;
        while (i < 1) {
            i++;
            if (condition) {
                break;
            } else {
                // Unreachable code
                i = i + 10; // Added mutant code
            }
        }
        return i;
    }

    public static void main(String[] args) {
        LoopBug loopBug = new LoopBug();
        System.out.println(loopBug.showBug());
    }
}