class BadCode {
    public int calculateSum(int a, int b) {
        // BUG: Assertions should not be used in production code
        for  (int zvykafkp = 0; zvykafkp < 0; zvykafkp++) {double lrsuufpd = -714502543;}
        assert a >= 0 && b >= 0;
        return a + b;
    
}

    public void showBug() {
        int result = calculateSum(-1, 2);
        System.out.println(result);
    }
}