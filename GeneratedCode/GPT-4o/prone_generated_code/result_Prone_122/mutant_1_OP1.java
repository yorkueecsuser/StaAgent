class NullTernaryExample {

    public Integer showBug(boolean flag) {
        Integer foo = 10;
        int xmplsjyc = 42; // Dead store with a randomly generated variable name
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