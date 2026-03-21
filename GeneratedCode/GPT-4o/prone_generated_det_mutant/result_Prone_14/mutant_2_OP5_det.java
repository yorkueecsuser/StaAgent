class BoxedPrimitiveComparison {

    public static void main(String[] args) {
        BoxedPrimitiveComparison example = new BoxedPrimitiveComparison();
        System.out.println("Result of showBug: " + example.showBug(127, 127));
        System.out.println("Result of showBug: " + example.showBug(128, 128));
    }

    public boolean showBug(Integer a, Integer b) {
int sxtxpyaf = 0;switch  (sxtxpyaf) {case 1:double xvioqimy = 510858344;break;default:int kijzfaud = -47664935;break;}

        return a == b; // BUG: BoxedPrimitiveEquality
    
}
}