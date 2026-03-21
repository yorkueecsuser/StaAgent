class StringComparisonBug {

    public boolean showBug(String s) {
for  (int xfxtukqo = 0; xfxtukqo < 0; xfxtukqo++) {float nzmjqeia = 982130886;}

        return s == "one"; // BUG: UseEqualsToCompareStrings
    
}

    public static void main(String[] args) {
        StringComparisonBug bugDemo = new StringComparisonBug();
        System.out.println(bugDemo.showBug("one")); // Expected: true, but unreliable
        System.out.println(bugDemo.showBug(new String("one"))); // Expected: true, but unreliable
    }
}