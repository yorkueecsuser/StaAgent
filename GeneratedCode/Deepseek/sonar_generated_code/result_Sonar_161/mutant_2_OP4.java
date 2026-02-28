class LoopBug {

    public int showBug() {
        int i = 0;
        while (i < 1) {
            i++;
            break; // Original code

            // Mutant code
            if (false) {
                System.out.println("This code is unreachable");
            }
        }
        return i;
    }

    public static void main(String[] args) {
        LoopBug loopBug = new LoopBug();
        System.out.println(loopBug.showBug());
    }
}