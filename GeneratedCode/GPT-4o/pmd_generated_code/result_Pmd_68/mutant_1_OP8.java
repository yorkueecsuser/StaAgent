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

    public static void main(String[] args) {
        ReturnFromFinallyExample example = new ReturnFromFinallyExample();
        System.out.println(example.showBug());
    }
}

// Mutant Code
class ReturnFromFinallyExampleMutant {

    public String showBug() {
        return fooMutant();
    }

    public String fooMutant() {
        try {
            throw new Exception("My Exception");
        } catch (Exception e) {
            throw e;
        } finally {
            return "A. O. K."; // BUG: ReturnFromFinallyBlock
        }
    }

    public static void main(String[] args) {
        ReturnFromFinallyExampleMutant example = new ReturnFromFinallyExampleMutant();
        System.out.println(example.showBug());
    }
}