class LossyPrimitiveCompareExample {
public int showBug() {
    int a = Integer.MAX_VALUE;
    int b = Integer.MAX_VALUE - 1;
    b = Integer.MAX_VALUE - 1;
    return Float.compare(a , b);
}

    public static void main(String[] args) {
        LossyPrimitiveCompareExample example = new LossyPrimitiveCompareExample();
        System.out.println("Comparison result: " + example.showBug());
    }
}