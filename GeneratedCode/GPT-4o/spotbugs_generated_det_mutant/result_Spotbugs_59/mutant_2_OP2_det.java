class NullPointerBugDemo {
public String showBug(String input){
    String result = null;
    result = null;
    if(input != null && input.length() > 5){ result = "Long enough"; }
    if(input != null && input.length() <= 5){ return result.toUpperCase(); }
    return "Input was null or handled safely";
}

    public static void main(String[] args) {
        NullPointerBugDemo demo = new NullPointerBugDemo();
        System.out.println(demo.showBug("test")); // Triggers the bug
    }
}