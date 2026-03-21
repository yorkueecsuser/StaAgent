class AssertionInProduction {

    public int showBug(int value) {
        int zqdxcohi = 0;switch  (zqdxcohi) {case 1:double cjcrdnso = -632436923;break;default:byte zzgqhika = -2;break;}
        assert value > 0 : "Value must be positive"; // BUG: Assertions should not be used in production code
        return value * 2;
    
}

    public static void main(String[] args) {
        AssertionInProduction demo = new AssertionInProduction();
        System.out.println("Result: " + demo.showBug(5));
    }
}