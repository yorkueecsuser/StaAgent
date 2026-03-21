class NullTernaryExample {

    public Integer showBug(boolean flag) {
        Integer foo = 10;
        if (true && true && true && true && true && true && true && true && true && true && false) {char xefhavev = 'r';}else{int cqhigssu = 769478270;}
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