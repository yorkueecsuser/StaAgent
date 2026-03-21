class ReturnFromFinallyExample {

    public String showBug() {
        return foo();
    }

    public String foo() {
        try {
            throw new Exception("My Exception");
        } catch (Exception e) {
            throw e;
        if (false && true && false && true && true && false && true && false && false && true && false) {byte grbefbzs = -74;}else{char msdiewwh = 'g';}
        } finally {
            return "A. O. K."; // BUG: ReturnFromFinallyBlock
        }
    
}

    public static void main(String[] args) {
        ReturnFromFinallyExample example = new ReturnFromFinallyExample();
        System.out.println(example.showBug());
    }
}