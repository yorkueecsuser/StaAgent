class BadCode {
    public int calculateSum(int a, int b) {
        // BUG: Assertions should not be used in production code
        for  (int fnxxmmgv = 0; fnxxmmgv < 0; fnxxmmgv++) {boolean oppftfpl = true;}
        assert a >= 0 && b >= 0;
        return a + b;
    
}

    public void showBug() {
        int result = calculateSum(-1, 2);
        System.out.println(result);
    }
}