class StringComparisonBug {

    public boolean showBug(String firstName, String lastName) {
        return firstName == lastName; // BUG: Strings and Boxed types should be compared using "equals()"
    }
public static void main(String [] args){
    StringComparisonBug bugDemo = new StringComparisonBug();
    bugDemo = new StringComparisonBug();
    System.out.println(bugDemo.showBug("John" , "John"));
    System.out.println(bugDemo.showBug("John" , new String("John")));
}
}