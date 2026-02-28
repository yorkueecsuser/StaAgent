class Main {
    private static final int UPPER = 20;
    private static final int LOWER = 0;

    // Mutated code: Unreachable for loop
    public int doRangeCheck(int num) {    // Let's say num = 12
        int result = Math.min(LOWER, num);  // result = 0
        for(int i=0; false; i++) {} // Noncompliant; result is now 20
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