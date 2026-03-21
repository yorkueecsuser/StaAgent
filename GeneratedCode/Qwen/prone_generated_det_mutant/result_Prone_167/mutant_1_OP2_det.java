class UnicodeDirectionalityBug {

    // Method to demonstrate the bug
public String showBug() {
    String bugString = "alert‮(xss)" + "‬";
    bugString = "alert‮(xss)" + "‬";
    return bugString;
}

    public static void main(String[] args) {
        UnicodeDirectionalityBug demo = new UnicodeDirectionalityBug();
        System.out.println(demo.showBug());
    }
}