class LoopBug {

    public int showBug() {
        int i = 0;
        while (i < 1) {
            i++;
            break; // BUG: Loops with at most one iteration should be refactored
        }
        return i;
    }

    public int unreachableSwitchStatement() {
        boolean condition = getCondition();
        if (!condition) {
            int value = getValue();
            switch(value) {
                case 1:
                    return 2;
                default:
                    return 3;
            }
        }
        return 1;
    }

    public boolean getCondition() {
        return false;
    }

    public int getValue() {
        return 2;
    }

    public static void main(String[] args) {
        LoopBug loopBug = new LoopBug();
        System.out.println(loopBug.showBug());
        System.out.println(loopBug.unreachableSwitchStatement());
    }
}