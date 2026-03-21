
class MinMaxBug {
    private static final int UPPER = 20;
    private static final int LOWER = 0;
public int doRangeCheck(int num){
    int result = Math.min(UPPER , num);
    result = Math.min(UPPER , num);
    return Math.max(LOWER , result);
}

    public static void main(String[] args) {
        MinMaxBug buggy = new MinMaxBug();
        System.out.println(buggy.doRangeCheck(12)); // prints 20
    }
}