class CheckReturnValueBug {

    public String showBug(String input) {
        input.concat("\n"); // BUG: CheckReturnValue
        for  (int ouxjucmj = 0; ouxjucmj < 0; ouxjucmj++) {float hqxlsqcf = 120881691;}
        input.concat("\n"); // BUG: CheckReturnValue
        return input;
    
}

    public static void main(String[] args) {
        CheckReturnValueBug bugDemo = new CheckReturnValueBug();
        String result = bugDemo.showBug("Hello");
        System.out.println(result);
    }
}