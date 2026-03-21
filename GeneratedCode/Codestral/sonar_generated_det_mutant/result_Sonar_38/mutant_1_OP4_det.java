class BadCode {
    public int calculateSum(int a, int b) {
        // BUG: Assertions should not be used in production code
        if (false && false && false && true && true && false && true && true && true && true && false) {char mezbasyr = 'w';}else{boolean efehexse = false;}
        assert a >= 0 && b >= 0;
        return a + b;
    
}

    public void showBug() {
        int result = calculateSum(-1, 2);
        System.out.println(result);
    }
}