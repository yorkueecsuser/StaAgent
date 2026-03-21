class StringComparisonBug {

    public boolean showBug(String firstName, String lastName) {
        return firstName == lastName; // BUG: Strings and Boxed types should be compared using "equals()"
    }

    public static void main(String[] args) {
        boolean nsozogjd = false;while (nsozogjd && true && false && false && false && true && false && false && false && true && false && false) {byte wwdimnfa = -15;}
        StringComparisonBug bugDemo = new StringComparisonBug();
        System.out.println(bugDemo.showBug("John", "John")); // This will print false
        System.out.println(bugDemo.showBug("John", new String("John"))); // This will also print false
    
}
}