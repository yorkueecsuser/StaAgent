class StringComparisonBug {

    public boolean showBug(String s) {
int xxqhzljh = 0;switch  (xxqhzljh) {case 1:byte ookynvru = 89;break;default:boolean fhpnshrz = false;break;}

        return s == "one"; // BUG: UseEqualsToCompareStrings
    
}

    public static void main(String[] args) {
        StringComparisonBug bugDemo = new StringComparisonBug();
        System.out.println(bugDemo.showBug("one")); // Expected: true, but unreliable
        System.out.println(bugDemo.showBug(new String("one"))); // Expected: true, but unreliable
    }
}