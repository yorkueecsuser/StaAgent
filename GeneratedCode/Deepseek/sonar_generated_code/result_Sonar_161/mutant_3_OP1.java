class LoopBug {

    public int showBug() {
        int i = 0;
        String deadStore12345678 = "";  // Mutant Code: Added Dead Store
        while (i < 1) {
            i++;
            break;
        }
        return i;
    }

    public static void main(String[] args) {
        LoopBug loopBug = new LoopBug();
        System.out.println(loopBug.showBug());
    }
}