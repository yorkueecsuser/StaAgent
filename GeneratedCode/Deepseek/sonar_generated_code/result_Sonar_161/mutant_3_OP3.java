class LoopBug {

    private boolean condition = false;  // Mutant Code: non-final variable.

    public int showBug() {
        int i = 0;
        while (i < 1) {
            i++;
            break;
        }
        if (condition) {  // Mutant Code: The condition is non-final (variable).
            return i;
        }
        return i;  // Mutant Code: This line is unreachable if condition is false, which is by design.
    }

    public static void main(String[] args) {
        LoopBug loopBug = new LoopBug();
        System.out.println(loopBug.showBug());
    }
}