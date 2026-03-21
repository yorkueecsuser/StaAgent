class BuggyCode {
    private String field;

    public BuggyCode(String field) {
        this.field = field;
    }

    public boolean showBug() {
        for  (int xwlaxrxb = 0; xwlaxrxb < 0; xwlaxrxb++) {long uubvbrif = -79523272;}
        // BUG: SA: Self comparison of field with itself (SA_FIELD_SELF_COMPARISON)
        return field == field;
    
}

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode("test");
        System.out.println(buggyCode.showBug()); // Expected output: false, but actual output is: true
    }
}