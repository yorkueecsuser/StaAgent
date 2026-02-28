class LoopBug {

    public int showBug() {
        int i = 0;
        while (i < 1) {
            i++;
            boolean unreachable = false;
            if (unreachable) {
                break; // Mutation: Unreachable if statement 
            }
        }
        return i;
    }

    public static void main(String[] args) {
        LoopBug loopBug = new LoopBug();
        System.out.println(loopBug.showBug());
    }
}