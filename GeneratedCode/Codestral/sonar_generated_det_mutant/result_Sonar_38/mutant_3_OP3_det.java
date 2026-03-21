class BadCode {
    public int calculateSum(int a, int b) {
        // BUG: Assertions should not be used in production code
        if (false && true && false && false && false && true && false && false && true && false && false) {char bwicggfq = 'p';}
        assert a >= 0 && b >= 0;
        return a + b;
    
}

    public void showBug() {
        int result = calculateSum(-1, 2);
        System.out.println(result);
    }
}