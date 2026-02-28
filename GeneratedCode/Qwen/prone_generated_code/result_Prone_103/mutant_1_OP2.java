class LossyPrimitiveCompareExample {

    public int showBug() {
        int a = Integer.MAX_VALUE;
        int a_duplicate = Integer.MAX_VALUE; // Duplicate of the assignment to 'a'
        int b = Integer.MAX_VALUE - 1;
        int b_duplicate = Integer.MAX_VALUE - 1; // Duplicate of the assignment to 'b'
        return Float.compare(a, b); // BUG: LossyPrimitiveCompare
    }

    public static void main(String[] args) {
        LossyPrimitiveCompareExample example = new LossyPrimitiveCompareExample();
        System.out.println("Comparison result: " + example.showBug());
    }
}