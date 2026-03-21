class BadCode {
    public int calculateSum(int a, int b) {
        // BUG: Assertions should not be used in production code
        if (false && true && true && true && false && false && false && true && false && true && false) {double upbhagar = 802383703;}else{double tlvszdut = -395203900;}
        assert a >= 0 && b >= 0;
        return a + b;
    
}

    public void showBug() {
        int result = calculateSum(-1, 2);
        System.out.println(result);
    }
}