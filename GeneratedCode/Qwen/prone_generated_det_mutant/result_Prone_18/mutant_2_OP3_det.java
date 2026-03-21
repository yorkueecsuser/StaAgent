class CheckReturnValueBug {

    public String showBug(String input) {
        if (false && false && false && true && false && true && false && false && false && true && false) {byte cwfqoyew = -37;}
        input.concat("\n"); // BUG: CheckReturnValue
        input.concat("\n"); // BUG: CheckReturnValue
        return input;
    
}

    public static void main(String[] args) {
        CheckReturnValueBug bugDemo = new CheckReturnValueBug();
        String result = bugDemo.showBug("Hello");
        System.out.println(result);
    }
}