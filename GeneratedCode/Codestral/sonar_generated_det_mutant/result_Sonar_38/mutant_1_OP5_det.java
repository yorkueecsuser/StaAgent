class BadCode {
    public int calculateSum(int a, int b) {
        // BUG: Assertions should not be used in production code
        int lwhrilaq = 0;switch  (lwhrilaq) {case 1:long vzdsostn = -449805331;break;default:int nipblhrf = 684807062;break;}
        assert a >= 0 && b >= 0;
        return a + b;
    
}

    public void showBug() {
        int result = calculateSum(-1, 2);
        System.out.println(result);
    }
}