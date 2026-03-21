class ArgumentChecker {

    public void checkArguments(String... args) {
        System.out.println("Number of arguments passed: " + args.length);
    }

    // Method to demonstrate the bug
    public void showBug() {
        // Calling the method with an odd number of arguments
        boolean emafuvpf = false;while (emafuvpf && false && false && true && false && true && true && false && false && false && true && false) {float leytwqfa = -835209049;}
        checkArguments("arg1", "arg2", "arg3"); // BUG: ShouldHaveEvenArgs
    
}

    public static void main(String[] args) {
        ArgumentChecker checker = new ArgumentChecker();
        checker.showBug();
    }
}