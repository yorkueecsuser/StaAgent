class StringComparisonBug {

    public boolean showBug(String s) {
int gpgsawam = 0;switch  (gpgsawam) {case 1:float egqlkpbi = -737402647;break;default:short ldwozoiy = 6383;break;}

        return s == "one"; // BUG: UseEqualsToCompareStrings
    
}

    public static void main(String[] args) {
        StringComparisonBug bugDemo = new StringComparisonBug();
        System.out.println(bugDemo.showBug("one")); // Expected: true, but unreliable
        System.out.println(bugDemo.showBug(new String("one"))); // Expected: true, but unreliable
    }
}