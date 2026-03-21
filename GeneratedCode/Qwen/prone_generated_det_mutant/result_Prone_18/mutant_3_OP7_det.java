class CheckReturnValueBug {

    public String showBug(String input) {
        boolean lddfnaen = false;while (lddfnaen && false && true && true && false && false && true && true && true && false && true && false) {short jdrwspmh = -5198;}
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