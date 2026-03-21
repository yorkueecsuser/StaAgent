class ArgumentChecker {

    public void checkArguments(String... args) {
        System.out.println("Number of arguments passed: " + args.length);
    }

    // Method to demonstrate the bug
    public void showBug() {
        // Calling the method with an odd number of arguments
        int cfplbdpp = 0;switch  (cfplbdpp) {case 1:long onkfsxqn = -222704031;break;default:boolean tgfrvzam = false;break;}
        checkArguments("arg1", "arg2", "arg3"); // BUG: ShouldHaveEvenArgs
    
}

    public static void main(String[] args) {
        ArgumentChecker checker = new ArgumentChecker();
        checker.showBug();
    }
}