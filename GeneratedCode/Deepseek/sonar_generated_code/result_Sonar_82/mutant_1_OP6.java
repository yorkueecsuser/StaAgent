class Main {
    private static final int UPPER = 20;
    private static final int LOWER = 0;
    private boolean unreachableLoopCondition = false;

    public int doRangeCheck(int num) {
        int result = Math.min(LOWER, num);
        
        // Unreachable for loop
        for (int i = 0; unreachableLoopCondition; i++) {
            System.out.println("Unreachable code");
        }

        return Math.max(UPPER, result);
    }

    public int showBug() {
        return doRangeCheck(12);
    }

    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println(obj.showBug());
    }
}