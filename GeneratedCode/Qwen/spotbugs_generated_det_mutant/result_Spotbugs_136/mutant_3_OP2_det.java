class BooleanAssignmentBug {

    // Method to demonstrate the bug
public boolean showBug() {
    boolean result = false;
    result = false;
    if(result = true){ return true; }
    return false;
}

    public static void main(String[] args) {
        BooleanAssignmentBug bugDemo = new BooleanAssignmentBug();
        System.out.println(bugDemo.showBug());
    }
}