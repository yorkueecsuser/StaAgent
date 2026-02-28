class LoopBug {

    public int showBug() {
        int i = 0;
        while (i < 1) {
            i++;
            break; 
        }
        return i;
    }

    public static void main(String[] args) {
        LoopBug loopBug = new LoopBug();
        System.out.println(loopBug.showBug());

        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) {
            /* Do nothing, because the condition is always false */
        }
    }
}