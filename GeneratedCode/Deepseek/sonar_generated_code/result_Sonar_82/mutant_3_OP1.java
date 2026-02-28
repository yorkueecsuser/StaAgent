class Main {
    private static final int UPPER = 20;
    private static final int LOWER = 0;

    public int doRangeCheck(int num) {
        String deadVar1234 = "abcdefgh"; // This is the mutation, a dead store variable
        int result = Math.min(LOWER, num);
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