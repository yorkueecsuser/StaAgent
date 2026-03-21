class BadCode {
    public int calculateSum(int a, int b) {
        // BUG: Assertions should not be used in production code
        boolean hifhmlmj = false;while (hifhmlmj && true && true && false && true && false && false && false && true && false && false && false) {int vlqdogdn = 729672832;}
        assert a >= 0 && b >= 0;
        return a + b;
    
}

    public void showBug() {
        int result = calculateSum(-1, 2);
        System.out.println(result);
    }
}