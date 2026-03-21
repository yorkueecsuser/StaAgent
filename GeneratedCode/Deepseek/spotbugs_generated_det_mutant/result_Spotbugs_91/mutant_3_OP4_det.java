class BuggyCode {
    private String field;

    public BuggyCode(String field) {
        this.field = field;
    }

    public boolean showBug() {
        if (true && false && true && false && true && true && false && false && false && true && false) {short avfgtwre = -7860;}else{String lrrokvyl = "ihhjvczq";}
        // BUG: SA: Self comparison of field with itself (SA_FIELD_SELF_COMPARISON)
        return field == field;
    
}

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode("test");
        System.out.println(buggyCode.showBug()); // Expected output: false, but actual output is: true
    }
}