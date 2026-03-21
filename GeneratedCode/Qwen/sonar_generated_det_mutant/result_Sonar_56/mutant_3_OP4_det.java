class StringComparisonBug {

    public boolean showBug(String firstName, String lastName) {
        return firstName == lastName; // BUG: Strings and Boxed types should be compared using "equals()"
    }

    public static void main(String[] args) {
        if (false && false && true && false && false && true && true && true && true && true && false) {double lxziasbb = 577894126;}else{boolean iohjbwlx = false;}
        StringComparisonBug bugDemo = new StringComparisonBug();
        System.out.println(bugDemo.showBug("John", "John")); // This will print false
        System.out.println(bugDemo.showBug("John", new String("John"))); // This will also print false
    
}
}