class ReturnFromFinallyExample {

    public String showBug() {
        return foo();
    }

    public String foo() {
        try {
            throw new Exception("My Exception");
        } catch (Exception e) {
            throw e;
        } finally {
            String result = "A. O. K."; // Assignment statement for potential duplication
            result = "A. O. K."; // Duplicate of the above assignment statement
            return result; // BUG: ReturnFromFinallyBlock
        }
    }

    public static void main(String[] args) {
        ReturnFromFinallyExample example = new ReturnFromFinallyExample();
        System.out.println(example.showBug());
    }
}