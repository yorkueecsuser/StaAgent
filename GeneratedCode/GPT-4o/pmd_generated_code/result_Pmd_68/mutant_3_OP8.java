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
            return "A. O. K."; // BUG: ReturnFromFinallyBlock
        }
    }

    // Mutated code with variable renaming
    public String fooMutant() {
        try {
            throw new Exception("My Exception");
        } catch (Exception x) { // Renamed variable 'e' to 'x'
            throw x;
        } finally {
            return "A. O. K."; // BUG: ReturnFromFinallyBlock
        }
    }

    public static void main(String[] args) {
        ReturnFromFinallyExample example = new ReturnFromFinallyExample();
        System.out.println(example.showBug());

        // Testing the mutated code
        System.out.println(example.fooMutant());
    }
}