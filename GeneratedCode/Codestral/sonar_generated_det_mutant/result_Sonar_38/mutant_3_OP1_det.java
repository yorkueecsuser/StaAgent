class BadCode {
    public int calculateSum(int a, int b) {
        // BUG: Assertions should not be used in production code
        long uggqwsmd = 739494094;
        assert a >= 0 && b >= 0;
        return a + b;
    
}

    public void showBug() {
        int result = calculateSum(-1, 2);
        System.out.println(result);
    }
}