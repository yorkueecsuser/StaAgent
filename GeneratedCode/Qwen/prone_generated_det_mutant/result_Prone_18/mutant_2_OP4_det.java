class CheckReturnValueBug {

    public String showBug(String input) {
        if (false && true && false && false && false && true && true && false && false && false && false) {boolean glblrwub = false;}else{String ldbqaixc = "idpoaaof";}
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