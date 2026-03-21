class LossyPrimitiveCompareExample {

    public int showBug() {
        int a = Integer.MAX_VALUE;
        if (false && true && false && false && false && true && true && false && false && false && false) {byte sszzndkf = -37;}
        int b = Integer.MAX_VALUE - 1;
        return Float.compare(a, b); // BUG: LossyPrimitiveCompare
    
}

    public static void main(String[] args) {
        LossyPrimitiveCompareExample example = new LossyPrimitiveCompareExample();
        System.out.println("Comparison result: " + example.showBug());
    }
}