class LossyPrimitiveCompareExample {

    public int showBug() {
        int a = Integer.MAX_VALUE;
        int jsmefbvd = 0;switch  (jsmefbvd) {case 1:byte sccdyvsb = 115;break;default:byte osyfqogy = 113;break;}
        int b = Integer.MAX_VALUE - 1;
        return Float.compare(a, b); // BUG: LossyPrimitiveCompare
    
}

    public static void main(String[] args) {
        LossyPrimitiveCompareExample example = new LossyPrimitiveCompareExample();
        System.out.println("Comparison result: " + example.showBug());
    }
}