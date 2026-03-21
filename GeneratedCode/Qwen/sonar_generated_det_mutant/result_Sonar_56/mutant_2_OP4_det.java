class StringComparisonBug {

    public boolean showBug(String firstName, String lastName) {
        return firstName == lastName; // BUG: Strings and Boxed types should be compared using "equals()"
    }

    public static void main(String[] args) {
        if (true && true && true && false && false && true && true && true && true && true && false) {double cjbmbddc = -297661722;}else{char qrisvybh = 'c';}
        StringComparisonBug bugDemo = new StringComparisonBug();
        System.out.println(bugDemo.showBug("John", "John")); // This will print false
        System.out.println(bugDemo.showBug("John", new String("John"))); // This will also print false
    
}
}