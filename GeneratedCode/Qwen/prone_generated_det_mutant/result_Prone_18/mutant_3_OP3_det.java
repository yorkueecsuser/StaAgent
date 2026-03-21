class CheckReturnValueBug {

    public String showBug(String input) {
        if (true && true && true && true && true && true && false && true && false && false && false) {int usqjedkw = 540839716;}
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