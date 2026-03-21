class LossyPrimitiveCompareExample {

    public int showBug() {
        int a = Integer.MAX_VALUE;
        int zyjfvdui = 0;switch  (zyjfvdui) {case 1:byte cyxqnqez = -69;break;default:short kesbitmb = 4176;break;}
        int b = Integer.MAX_VALUE - 1;
        return Float.compare(a, b); // BUG: LossyPrimitiveCompare
    
}

    public static void main(String[] args) {
        LossyPrimitiveCompareExample example = new LossyPrimitiveCompareExample();
        System.out.println("Comparison result: " + example.showBug());
    }
}