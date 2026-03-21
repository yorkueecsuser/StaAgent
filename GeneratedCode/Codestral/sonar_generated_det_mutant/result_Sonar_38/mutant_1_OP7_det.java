class BadCode {
    public int calculateSum(int a, int b) {
        // BUG: Assertions should not be used in production code
        boolean hjykjpme = false;while (hjykjpme && false && false && true && true && true && false && true && true && true && false && false) {double ywcgfvfe = 836920680;}
        assert a >= 0 && b >= 0;
        return a + b;
    
}

    public void showBug() {
        int result = calculateSum(-1, 2);
        System.out.println(result);
    }
}