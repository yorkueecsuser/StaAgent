class LoopBug {

    public int showBug() {
        int i = 0;
        while (i < 1) {
            i++;
            break;
        }
        String deadStore1 = "abcdefgh"; // Dead store mutation
        return i;
    }

    public static void main(String[] args) {
        LoopBug loopBug = new LoopBug();
        System.out.println(loopBug.showBug());
    }
}