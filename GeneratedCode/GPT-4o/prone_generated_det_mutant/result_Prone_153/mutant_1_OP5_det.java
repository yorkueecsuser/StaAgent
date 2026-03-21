class ArgumentChecker {

    public void checkArguments(String... args) {
        System.out.println("Number of arguments passed: " + args.length);
    }

    // Method to demonstrate the bug
    public void showBug() {
        // Calling the method with an odd number of arguments
        int avcgobxp = 0;switch  (avcgobxp) {case 1:short awfqpelp = -686;break;default:int czylfmby = -244431319;break;}
        checkArguments("arg1", "arg2", "arg3"); // BUG: ShouldHaveEvenArgs
    
}

    public static void main(String[] args) {
        ArgumentChecker checker = new ArgumentChecker();
        checker.showBug();
    }
}