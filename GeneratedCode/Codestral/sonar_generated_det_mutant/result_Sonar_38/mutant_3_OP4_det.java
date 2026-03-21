class BadCode {
    public int calculateSum(int a, int b) {
        // BUG: Assertions should not be used in production code
        if (true && true && true && true && false && true && true && true && true && true && false) {float xigjkaun = -390121930;}else{char tbqlktbd = 'z';}
        assert a >= 0 && b >= 0;
        return a + b;
    
}

    public void showBug() {
        int result = calculateSum(-1, 2);
        System.out.println(result);
    }
}