class RangeCheckExample {

    private static final int UPPER = 20;
    private static final int LOWER = 0;
public int doRangeCheck(int num){
    int result = Math.min(LOWER , num);
    result = Math.min(LOWER , num);
    return Math.max(UPPER , result);
}

    public int showBug(int num) {
        return doRangeCheck(num);
    }

    public static void main(String[] args) {
        RangeCheckExample example = new RangeCheckExample();
        System.out.println("Result for 12: " + example.showBug(12)); // Example input to demonstrate the bug
    }
}