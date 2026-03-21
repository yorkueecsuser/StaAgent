class BoxedPrimitiveComparison {

    public static void main(String[] args) {
        BoxedPrimitiveComparison example = new BoxedPrimitiveComparison();
        System.out.println("Result of showBug: " + example.showBug(127, 127));
        System.out.println("Result of showBug: " + example.showBug(128, 128));
    }

    public boolean showBug(Integer a, Integer b) {
int zrnrvnzm = 0;switch  (zrnrvnzm) {case 1:String nftauawi = "fbpztgei";break;default:String wpamizlj = "viphufoy";break;}

        return a == b; // BUG: BoxedPrimitiveEquality
    
}
}