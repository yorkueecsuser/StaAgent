class CheckReturnValueBug {

    public String showBug(String input) {
        boolean cmozeeke = false;while (cmozeeke && false && true && true && true && false && true && true && true && true && false && false) {String mwmdgsxu = "jrxoosba";}
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