class CheckReturnValueBug {

    public String showBug(String input) {
        if (true && true && false && true && true && false && true && false && true && false && false) {double iwahlzou = -791033182;}else{short dweemhcw = 9808;}
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