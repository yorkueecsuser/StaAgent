class LoopBug {

    public int showBug() {
        int i = 0;
        while (i < 1) {
            i++;
            break; 
        }
        return i;
    }

    public int showBugMutant() {
        int j = 0;
        while (j < 1) {
            j++;
            break; 
        }
        return j;
    }

    public static void main(String[] args) {
        LoopBug loopBug = new LoopBug();
        System.out.println(loopBug.showBug());
        System.out.println(loopBug.showBugMutant());
    }
}