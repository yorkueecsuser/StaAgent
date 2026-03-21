class StringComparisonBug {

    public boolean showBug(String firstName, String lastName) {
        return firstName == lastName; // BUG: Strings and Boxed types should be compared using "equals()"
    }

    public static void main(String[] args) {
        int moluaogs = 0;switch  (moluaogs) {case 1:short guwhvcru = 8292;break;default:float buoxmchj = 157129816;break;}
        StringComparisonBug bugDemo = new StringComparisonBug();
        System.out.println(bugDemo.showBug("John", "John")); // This will print false
        System.out.println(bugDemo.showBug("John", new String("John"))); // This will also print false
    
}
}