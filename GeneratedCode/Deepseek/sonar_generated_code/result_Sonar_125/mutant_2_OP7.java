class Main {
    public static void main(String[] args) {
        System.out.println("Integer Shift Bug: " + showBug(32));
    }

    public static int showBug(int shift) {
        int number = 1;
        return number << shift;
    }
    
    // Mutation Operator: Unreachable while loop
    // Description: Inserting unreachable while loop into a randomly selected basic block in the program.
    // The condition of the inserted loop is always false to make it unreachable.
    // Mutation Code: while(false){ int unreachableVariable = 0; }
    // Reason: To avoid unreachable statement error, instead of using `while (false)` directly, use a non-final variable or an equivalent method call.
    static {
        boolean condition = false;
        while (condition) {
            int unreachableVariable = 0;
        }
    }
}