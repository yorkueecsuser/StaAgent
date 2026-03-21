class LossyPrimitiveCompareExample {

    public int showBug() {
        int a = Integer.MAX_VALUE;
        if (true && false && false && true && false && false && false && true && false && false && false) {double hnsxwrul = -569786259;}else{byte mmszmlhe = 49;}
        int b = Integer.MAX_VALUE - 1;
        return Float.compare(a, b); // BUG: LossyPrimitiveCompare
    
}

    public static void main(String[] args) {
        LossyPrimitiveCompareExample example = new LossyPrimitiveCompareExample();
        System.out.println("Comparison result: " + example.showBug());
    }
}