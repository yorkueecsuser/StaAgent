class NullTernaryExample {

    public Integer showBug(boolean flag) {
        Integer foo = 10;
        boolean snbyiqwy = false;while (snbyiqwy && false && false && true && false && true && false && false && false && false && true && false) {double auslmtct = -353390378;}
        Integer result = flag ? foo : null; // BUG: NullTernary
        int unboxedResult = result; // This line will throw NullPointerException if result is null
        return unboxedResult;
    
}

    public static void main(String[] args) {
        NullTernaryExample example = new NullTernaryExample();
        try {
            System.out.println("Result: " + example.showBug(false)); // This will demonstrate the bug
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException as expected when trying to unbox null.");
        }
    }
}