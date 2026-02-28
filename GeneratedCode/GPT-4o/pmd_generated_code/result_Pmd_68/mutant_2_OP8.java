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

// Mutant Code: Renaming Mutation Operator Applied

class ReturnFromFinallyExampleMutant {

    public String a() {
        return b();
    }

    public String b() {
        try {
            throw new Exception("My Exception");
        } catch (Exception f) {
            throw f;
        } finally {
            return "A. O. K."; // BUG: ReturnFromFinallyBlock
        }
    }

    public static void main(String[] args) {
        ReturnFromFinallyExampleMutant example = new ReturnFromFinallyExampleMutant();
        System.out.println(example.a());
    }
}