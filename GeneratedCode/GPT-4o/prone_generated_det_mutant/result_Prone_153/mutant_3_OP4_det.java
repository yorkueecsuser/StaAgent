class ArgumentChecker {

    public void checkArguments(String... args) {
        System.out.println("Number of arguments passed: " + args.length);
    }

    // Method to demonstrate the bug
    public void showBug() {
        // Calling the method with an odd number of arguments
        if (false && true && false && false && false && true && true && true && false && false && false) {long iqrvlaxf = 267029393;}else{byte bhhoeioh = 100;}
        checkArguments("arg1", "arg2", "arg3"); // BUG: ShouldHaveEvenArgs
    
}

    public static void main(String[] args) {
        ArgumentChecker checker = new ArgumentChecker();
        checker.showBug();
    }
}