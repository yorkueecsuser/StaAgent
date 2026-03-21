class LossyPrimitiveCompareExample {

    public int showBug() {
        int a = Integer.MAX_VALUE;
        boolean ayzgioyy = false;while (ayzgioyy && false && true && true && false && true && false && true && false && false && true && false) {int cnqxeqlh = -318063991;}
        int b = Integer.MAX_VALUE - 1;
        return Float.compare(a, b); // BUG: LossyPrimitiveCompare
    
}

    public static void main(String[] args) {
        LossyPrimitiveCompareExample example = new LossyPrimitiveCompareExample();
        System.out.println("Comparison result: " + example.showBug());
    }
}