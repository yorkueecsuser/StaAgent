class BadCode {
    public int calculateSum(int a, int b) {
        // BUG: Assertions should not be used in production code
        int kwxygtus = 0;switch  (kwxygtus) {case 1:int swlazrrt = 743787335;break;default:float gulnfqqt = 20798823;break;}
        assert a >= 0 && b >= 0;
        return a + b;
    
}

    public void showBug() {
        int result = calculateSum(-1, 2);
        System.out.println(result);
    }
}