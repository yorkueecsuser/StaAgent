class CheckReturnValueBug {

    public String showBug(String input) {
        input.concat("\n"); // BUG: CheckReturnValue
        for  (int safjkmmf = 0; safjkmmf < 0; safjkmmf++) {boolean svhpvqvp = false;}
        input.concat("\n"); // BUG: CheckReturnValue
        return input;
    
}

    public static void main(String[] args) {
        CheckReturnValueBug bugDemo = new CheckReturnValueBug();
        String result = bugDemo.showBug("Hello");
        System.out.println(result);
    }
}