class BadCode {
    public int calculateSum(int a, int b) {
        // BUG: Assertions should not be used in production code
        boolean fjncvjyd = false;while (fjncvjyd && true && true && true && true && true && true && false && false && false && true && false) {short zijmecmk = -8757;}
        assert a >= 0 && b >= 0;
        return a + b;
    
}

    public void showBug() {
        int result = calculateSum(-1, 2);
        System.out.println(result);
    }
}