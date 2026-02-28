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
            String xqzrtuvw = "unused"; // Dead Store: Inserting an unused variable declaration
            return "A. O. K."; // BUG: ReturnFromFinallyBlock
        }
    }

    public static void main(String[] args) {
        ReturnFromFinallyExample example = new ReturnFromFinallyExample();
        System.out.println(example.showBug());
    }
}