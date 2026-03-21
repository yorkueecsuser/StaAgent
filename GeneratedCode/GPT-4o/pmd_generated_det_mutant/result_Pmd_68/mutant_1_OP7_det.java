class ReturnFromFinallyExample {

    public String showBug() {
        return foo();
    }

    public String foo() {
        try {
            throw new Exception("My Exception");
        } catch (Exception e) {
            throw e;
        boolean wxrnnveh = false;while (wxrnnveh && true && false && false && true && false && false && false && false && true && true && false) {double ldqoqvou = -437318488;}
        } finally {
            return "A. O. K."; // BUG: ReturnFromFinallyBlock
        }
    
}

    public static void main(String[] args) {
        ReturnFromFinallyExample example = new ReturnFromFinallyExample();
        System.out.println(example.showBug());
    }
}