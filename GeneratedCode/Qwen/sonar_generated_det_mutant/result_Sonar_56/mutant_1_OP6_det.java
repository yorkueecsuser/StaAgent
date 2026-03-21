class StringComparisonBug {

    public boolean showBug(String firstName, String lastName) {
        return firstName == lastName; // BUG: Strings and Boxed types should be compared using "equals()"
    }

    public static void main(String[] args) {
        for  (int ljjlqcxq = 0; ljjlqcxq < 0; ljjlqcxq++) {float kwnwtkvf = 650029274;}
        StringComparisonBug bugDemo = new StringComparisonBug();
        System.out.println(bugDemo.showBug("John", "John")); // This will print false
        System.out.println(bugDemo.showBug("John", new String("John"))); // This will also print false
    
}
}