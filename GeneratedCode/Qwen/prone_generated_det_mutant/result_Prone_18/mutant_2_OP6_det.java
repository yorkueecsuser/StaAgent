class CheckReturnValueBug {

    public String showBug(String input) {
        for  (int mtsywfar = 0; mtsywfar < 0; mtsywfar++) {byte pvmqueyx = 13;}
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