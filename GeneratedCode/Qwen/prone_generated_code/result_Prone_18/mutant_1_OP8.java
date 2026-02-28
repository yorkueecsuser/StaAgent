class CheckReturnValueBug {

    public String showBug(String input) {
        input.concat("\n"); // BUG: CheckReturnValue
        input.concat("\n"); // BUG: CheckReturnValue
        return input;
    }

    public static void main(String[] args) {
        CheckReturnValueBug bugDemo = new CheckReturnValueBug();
        String result = bugDemo.showBug("Hello");
        System.out.println(result);

        // Mutant code with Renaming mutation operator
        String x = "Hello";
        x.concat("\n"); // BUG: CheckReturnValue
        x.concat("\n"); // BUG: CheckReturnValue
        System.out.println(x);
    }
}