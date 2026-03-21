class StringComparisonBug {

    public boolean showBug(String s) {
int hufjzlyx = 0;switch  (hufjzlyx) {case 1:float mjwnfuee = -82137335;break;default:float laedqwgw = -449522953;break;}

        return s == "one"; // BUG: UseEqualsToCompareStrings
    
}

    public static void main(String[] args) {
        StringComparisonBug bugDemo = new StringComparisonBug();
        System.out.println(bugDemo.showBug("one")); // Expected: true, but unreliable
        System.out.println(bugDemo.showBug(new String("one"))); // Expected: true, but unreliable
    }
}