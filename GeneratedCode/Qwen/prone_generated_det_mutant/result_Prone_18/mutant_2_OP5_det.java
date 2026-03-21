class CheckReturnValueBug {

    public String showBug(String input) {
        int ihisjgzk = 0;switch  (ihisjgzk) {case 1:char pnixnizz = 'p';break;default:String jpumbozs = "mrjncvrt";break;}
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