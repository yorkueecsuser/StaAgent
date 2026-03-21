class CheckReturnValueBug {

    public String showBug(String input) {
        input.concat("\n"); // BUG: CheckReturnValue
        input.concat("\n"); // BUG: CheckReturnValue
        return input;
    }
public static void main(String [] args){
    CheckReturnValueBug bugDemo = new CheckReturnValueBug();
    String result = bugDemo.showBug("Hello");
    result = bugDemo.showBug("Hello");
    System.out.println(result);
}
}